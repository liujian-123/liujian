package com.liujian.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liujian.shop.service.GoodsService;

@Controller
public class GoodsController {

	@Autowired
	private GoodsService ser;
	//列表展示
	@RequestMapping("list") 
	public String getliString(Model model,String name) {
		//查询列表和模糊查询
		List list = ser.getlist(name);
		//吧查询到的数据存放到作用域中
		model.addAttribute("list", list);
		System.out.println(list);
		//跳转到页面
		return "list";
	}
	//删除
	@ResponseBody
	@RequestMapping("dels")
	public Object dels(String id) {
		System.out.println(id);
		//进行删除操作
		boolean  l = ser.dels(id);
		//返回值
		return l;
	}
	//通过id来进行查询某一条数据
	@RequestMapping("xq")
	public Object xq(String id,Model model) {
		System.out.println(id);
		List list = ser.getlistbyid(id);
		System.out.println(list);
		//把查到的数据放到作用域中
		model.addAttribute("list", list);
		//跳转到详情页面
		return "xq";
	}
	@RequestMapping("add")
	public Object add(Model model) {
		List list = ser.getBrand();
		System.out.println(list);
		List ss = ser.getKind();
		System.out.println(ss);
		model.addAttribute("list", list);
		model.addAttribute("ss", ss);
		return "add";
	}
	@RequestMapping("upd")
	public Object upd(Model model) {
		List list = ser.getBrand();
		System.out.println(list);
		List ss = ser.getKind();
		System.out.println(ss);
		model.addAttribute("list", list);
		model.addAttribute("ss", ss);
		return "upd";
	}
}
