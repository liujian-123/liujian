package com.liujian.shop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;


public interface GoodsMapper {

	List getlist(String name);

	boolean dels(@Param("id")String id);

	List getlistbyid(String id);

	List getBrand();

	List getKind();

}
