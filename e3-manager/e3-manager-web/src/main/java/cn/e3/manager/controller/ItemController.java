package cn.e3.manager.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3.manager.service.ItemService;
import cn.e3.pojo.TbItem;

@Controller
@RequestMapping("/item")
public class ItemController {
	
	@Resource
	private ItemService itemService;

	/**
	 * 根据id查询商品
	 */
	@RequestMapping("/id/{itemId}")
	@ResponseBody
	public TbItem findTbItemById(@PathVariable Long itemId){
		//调用service方法查询item并返回
		return itemService.findTbItemById(itemId);
	}
}
