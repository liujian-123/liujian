package com.liujian.shop.vo;

import com.liujian.shop.domain.Goods;

public class GoodsVO extends Goods{

	private String bname;
	private String sname;

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
	
}
