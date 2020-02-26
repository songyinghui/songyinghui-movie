package com.bw.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.bw.bean.Condition;
import com.bw.bean.Goods;
import com.bw.service.GoodService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class GoodController {
   @Autowired
   private GoodService service;
   
   @RequestMapping("list.do")
   public String getList(Model model,Condition con) {
	    if(con.getPageNum()==null) {
	    	con.setPageNum(1);
	    }
	    PageHelper.startPage(con.getPageNum(),3);
	    List<Goods> list=service.getList(con);
	    PageInfo<Goods> page = new PageInfo<Goods>(list);
	    model.addAttribute("page",page);
	    model.addAttribute("con",con);
	   
	   return "list";
   }
   @RequestMapping("getBList.do")
   @ResponseBody
   public Object getBlist() {
	   
	   return service.getBList();
   }
   @RequestMapping("getTList.do")
   @ResponseBody
   public Object getTlist() {
	   
	   return service.getTList();
   }
   @RequestMapping("toadd.do")
   public String ToAdd() {
	   return "add";
   }
   @RequestMapping("add.do")
   public String add(Goods good,MultipartFile myFile,HttpServletRequest request) throws IllegalStateException, IOException {
	   System.out.println(good);
	   if(!myFile.isEmpty()) {
		   //获取路径
		   String realPath = request.getRealPath("/pic/");
		   String originalFilename = myFile.getOriginalFilename();
		   String end=originalFilename.substring(originalFilename.lastIndexOf("."));
		   String start=UUID.randomUUID().toString();
		   File file = new File(realPath+start+end);
		   myFile.transferTo(file);  
		   good.setPic(start+end);
	   }
	   service.add(good);
	   return "redirect:list.do";
   }
}
