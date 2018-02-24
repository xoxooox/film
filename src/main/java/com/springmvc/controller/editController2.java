package com.springmvc.controller;

import javax.annotation.Resource;
import javax.persistence.Index;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;  
  
import com.springmvc.domain.User;

import com.springmvc.service.UserService;  
  
/** 
 * 功能概要：UserController 
 *  
 * @author guanjian 
 * @since  2015年9月28日  
 */  
@Controller  
public class editController2
{  
    @Resource  
    private UserService userService;  
      
    @RequestMapping(value ="/edit2")       
    //@RequestMapping("/edit")   
//    public ModelAndView getIndex(){    
//        ModelAndView mav = new ModelAndView("test");   
//        User user = userService.selectUserById(13);  
//        System.out.println(user.toString()); 
//        mav.addObject("user", user);   
//        System.out.println(mav.toString()); 
//        return mav;  
//    }    
    public  ModelAndView edit(HttpServletRequest request){
    	String hwj = "";
    	hwj = request.getParameter("hwj");
    	if(hwj != ""){
    	     return new ModelAndView("edit","hel",hwj+"9999999999111555000");
    	}
    	else{
    		return new ModelAndView("edit","hel","----------");
    	}
    }
}  