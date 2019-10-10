package com.liujian.shop.service;

import java.util.List;


public interface GoodsService {

	List getlist(String name);

	boolean dels(String id);

	List getlistbyid(String id);

	List getBrand();

	List getKind();

}
