package com.liujian.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liujian.shop.dao.GoodsMapper;
import com.liujian.shop.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService{

	@Autowired
	private GoodsMapper mapper;
	//列表
	public List getlist(String name) {
		// TODO Auto-generated method stub
		//返回并调用mapper中的接口
		return mapper.getlist(name);
	}
	//删除
	@Override
	public boolean dels(String id) {
		// TODO Auto-generated method stub
		//返回并调用mapper中的接口
		return mapper.dels(id);
	}
	//详情
	@Override
	public List getlistbyid(String id) {
		// TODO Auto-generated method stub
		//返回并调用mapper中的接口
		return mapper.getlistbyid(id);
	}
	@Override
	public List getBrand() {
		// TODO Auto-generated method stub
		return mapper.getBrand();
	}
	@Override
	public List getKind() {
		// TODO Auto-generated method stub
		return mapper.getKind();
	}
}
