package com.commerce.shop.controller;

import com.commerce.shop.dto.ItemDTO;
import com.commerce.shop.error.BusinessException;
import com.commerce.shop.model.ItemModel;
import com.commerce.shop.service.ItemService;
import com.commerce.shop.utils.CommonReturnType;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.format.DateTimeFormat;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/item",name = "商品")
@Slf4j
@CrossOrigin(allowCredentials = "true",allowedHeaders = "*")
public class ItemController extends BaseController {
    @Autowired
    private ItemService itemService;

    /**
     * 新增
     * @param title
     * @param price
     * @param stock
     * @param description
     * @param imgUrl
     * @return
     */
    @RequestMapping(value = "/create",name = "新增商品",method = RequestMethod.POST)
    public CommonReturnType createItem(@RequestParam(name = "title")String title,
                                       @RequestParam(name = "price")BigDecimal price,
                                       @RequestParam(name = "stock")Integer stock,
                                       @RequestParam(name = "description")String description,
                                       @RequestParam(name = "imgUrl")String imgUrl) throws BusinessException {
        //封装service 创建商品
        ItemModel itemModel = new ItemModel();
        itemModel.setTitle(title);
        itemModel.setPrice(price);
        itemModel.setStock(stock);
        itemModel.setDescription(description);
        itemModel.setImgUrl(imgUrl);

        ItemModel item = itemService.createItem(itemModel);
        ItemDTO itemDTO = convertDTOFromModel(item);

        return CommonReturnType.create(itemDTO);
    }

    @RequestMapping(value = "/get",name = "商品详情",method = RequestMethod.GET)
    public CommonReturnType get(@RequestParam(name = "id")Integer id){
        ItemModel itemModel = itemService.getItemById(id);

        ItemDTO itemDTO = convertDTOFromModel(itemModel);
        return CommonReturnType.create(itemDTO);
    }

    @RequestMapping(value = "/list",name = "商品列表",method = RequestMethod.GET)
    public CommonReturnType list(){
        List<ItemModel> itemModels = itemService.listItem();
        List<ItemDTO> dtoList = itemModels.stream().map(itemModel -> {
            ItemDTO itemDTO = convertDTOFromModel(itemModel);
            return itemDTO;
        }).collect(Collectors.toList());
        return CommonReturnType.create(dtoList);
    }

    /**
     * Model——>DTO
     * @param itemModel
     * @return
     */
    private ItemDTO convertDTOFromModel(ItemModel itemModel){
        if (itemModel == null){
            return null;
        }
        ItemDTO itemDTO = new ItemDTO();
        BeanUtils.copyProperties(itemModel,itemDTO);
        if (itemModel.getPromoModel()!=null){
            //有正在进行或者即将进行的秒杀活动
            itemDTO.setPromoStatus(itemModel.getPromoModel().getStatus());
            itemDTO.setPromoId(itemModel.getPromoModel().getId());
            itemDTO.setStartDate(itemModel.getPromoModel().getStartDate().toString(DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")));
            itemDTO.setPromoPrice(itemModel.getPromoModel().getPromoItemPrice());
        }else {
            itemDTO.setPromoStatus(0);
        }
        return itemDTO;
    }
}
