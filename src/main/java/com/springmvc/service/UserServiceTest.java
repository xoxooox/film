package com.springmvc.service;

import org.apache.log4j.Logger;  
//import org.junit.Test;  
import org.springframework.beans.factory.annotation.Autowired;  
  
import com.springmvc.baseTest.SpringTestCase;  
//import com.springmvc.domain.User;

//import com.springmvc.service.UserService;  
  
/** 
 * 功能概要：UserService单元测试 
 *  
 * @author guanjian 
 * @since  2015年9月28日  
 */  
public class UserServiceTest extends SpringTestCase {  
    @Autowired  
    //private UserService userService;  
    Logger logger = Logger.getLogger(UserServiceTest.class);  
      
    //@Test  
    public void selectUserByIdTest(){  
    	System.out.println("sdsds");
    	logger.debug("查找结果"); 
        //User user = userService.selectUserById(15);  
        //logger.debug("查找结果" + user);  
    }  
      
  
}  
