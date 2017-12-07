package cn.e3.manager.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.e3.manager.service.ItemService;
import cn.e3.mapper.TbItemMapper;
import cn.e3.pojo.TbItem;

@Service
public class ItemServiceImpl implements ItemService {

	@Resource
	private TbItemMapper tbItemMapper;
	
	/**
	 * 根据id查询商品
	 */
	@Override
	public TbItem findTbItemById(Long tbItem) {
		// TODO Auto-generated method stub
		return tbItemMapper.selectByPrimaryKey(tbItem);
	}

}
