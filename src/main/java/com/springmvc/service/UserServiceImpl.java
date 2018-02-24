package com.springmvc.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

//import com.mysql.fabric.xmlrpc.base.Array;
import com.springmvc.dao.UserDao;  
import com.springmvc.domain.User;
import com.springmvc.service.UserService;  

/** 
* 功能概要：UserService实现类 
*  
* @author guanjian 
* @since  2015年9月28日  
*/  
@Service()
public class UserServiceImpl implements UserService{  
  @Autowired  
  private UserDao userDao;  

  public User selectUserById(Integer userId) {  
      return userDao.selectUserById(userId);  
        
  } 
  
  public String returnHello(){
	  String s ="hello world!";
	  return s;
  }
/**
public User insertUser(String[][] userList) {
    return userDao.insertUser(userList);  
}    
**/
public int insertOne(User user) {
     return userDao.insertOne(user);  
} 

public int deleteUserById(Integer userId) {
     return userDao.deleteUserById(userId);  
} 

public int updateUser(User user) {
     return userDao.updateUser(user);  
} 

public void insertOnes(List<User> ones){
	userDao.insertOnes(ones);
}

}  