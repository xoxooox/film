package com.springmvc.controller;
import org.apache.log4j.Logger;

 
  
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
//import javax.validation.constraints.Null;

//import org.apache.ibatis.annotations.Delete;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;

//import com.mysql.fabric.xmlrpc.base.Array;
import com.springmvc.domain.User;

import com.springmvc.service.UserService;

  
/** 
 * 功能概要：UserController 
 *  
 * @author guanjian 
 * @since  2015年9月28日  
 */  
@Controller  
public class UserController {  
    @Resource  
    private UserService userService;  
      
    @RequestMapping("/test")  
    public ModelAndView getIndex(){    
        ModelAndView mav = new ModelAndView("test");   
        User user = userService.selectUserById(12);  
        System.out.println(user.toString()); 
        mav.addObject("user", user);   
        System.out.println(mav.toString()); 
        
        return mav;  
    } 
    
    @RequestMapping("/testHello") 
    public ModelAndView hello(){
    	String returnString;
    	returnString = userService.returnHello();
    	//Logger logger = Logger.getLogger(LoggerTest.class);
    	Logger logger = Logger.getLogger(UserController.class);
    	//logger.error("This is error message.");  
    	// 记录debug级别的信息  
        logger.debug("++++++++++This is debug message.+++++++++++"); 
    	logger.error("--------This is error message.---------"); 
    	return new ModelAndView("testHello","message",returnString);
    	
    	//return "demo";  
    }
    
   
  //删除  
  @RequestMapping("/testDelete")  
  public ModelAndView deleteIndex(){    
      ModelAndView mav = new ModelAndView("demodelete");   
      userService.deleteUserById(40);  
      User user = new User();
      mav.addObject("user", user);   
      
      return mav;  
  } 
    
    //插入
    @RequestMapping("/testOne")
    public String insertOne(){
	    
	    User user = new User();  
	    user.setUserName("guan003");  
	    user.setUserPassword("pwd003"); 
	    
	    //System.out.println("插入前主键为："+user.getUserId());  
	    try{
		    userService.insertOne(user);//插入操作 
	    } 
	    catch (Exception e) {
	    	e.printStackTrace() ; 
			// TODO: handle exception
		}
	    //System.out.println("插入后主键为："+user.getUserId());
	    return "demo";   
    }    
  
    //修改
    @RequestMapping("/testUpdate")
    public ModelAndView updateOne(){
	    
	    User user = new User();  
	    user.setUserName("guan0040up");  
	    user.setUserPassword("pwd0040up"); 
	    user.setUserId(40); 
	    
	     
	    try{
		    userService.updateUser(user);//插入操作 
	    } 
	    catch (Exception e) {
	    	e.printStackTrace() ; 
			// TODO: handle exception
		}
	    
	    Map<String,Object> data = new HashMap<String,Object>();  
	    data.put("user",user);  
	    return new ModelAndView("demoupdate",data); 
	
    }
    
    //插入多条
    @RequestMapping("/testOnes")    
    public String insertOnes(){
        //String[][] userList = {{"gu11","pwgu1"},{"gu2","pwgu2"}};
    	List<User> ones = new ArrayList<User>(); 
    	/*
    	User e = new User();
    	e.setUserName("gu11");
    	e.setUserPassword("pwgu1");
    	ones.add(e);

    	User e2 = new User();
    	e2.setUserName("gu2");
    	e2.setUserPassword("pwgu2");
    	ones.add(e2);
    	

    	System.out.println("++++++++++++++++++++++"+ e.getUserName()+"+++++++++++++++++++++");  
    	System.out.println("++++++++++++++++++++++"+ ones.size() +"+++++++++++++++++++++");   

    	String []list = {"ma","cao","yuan"};
    	System.out.println("----------"+list.length);
    	*/
	/*	List list1 = new ArrayList();
		list1.add("123");
		int c	=list1.size();
    	
    	System.out.println("---------------"+c);
    	/**
	   for(int i=0;i<ones.size();i++){
		    System.out.println("**************"+ones.get(i)+"****************");
		   }
    	
    	
        for (User tmp : ones) {  
           System.out.println("----------------------"+tmp.getUserName()+"---------------------");  
        }  
    	**/
    
 /*  	
    	e.setUserName("gu2");
    	e.setUserPassword("pwgu2");
    	ones.add(e);
*/
    	
        userService.insertOnes(ones);
	    return "demo"; 
    }
}  