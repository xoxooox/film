package com.springmvc.service;


import java.util.List;

//import org.springframework.web.servlet.ModelAndView;

//import com.mysql.fabric.xmlrpc.base.Array;

//import org.springframework.stereotype.Service;  

import com.springmvc.domain.User;  

/** 
* 功能概要：UserService接口类 
*  
* @author guanjian 
* @since  2015年9月28日  
*/  
public interface UserService {  
  User selectUserById(Integer userId);  
  //User insertUser(String[][] userList);
  int insertOne(User user);
  int deleteUserById(Integer userId);  
  void insertOnes(List<User> ones);
  int updateUser(User user);
  String returnHello();
}  