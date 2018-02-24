package com.springmvc.dao;

import java.util.List;

//import com.mysql.fabric.xmlrpc.base.Array;
import com.springmvc.domain.User;  

/** 
 * 功能概要：User的DAO类 
 *  
 * @author guanjian 
 * @since 2017年8月18日 
 */  
public interface UserDao {  
    /** 
     *  
	 * @author guanjian 
	 * @since 2017年8月18日 
     * @param userId 
     * @return 
     */  
    public User selectUserById(Integer userId);  
    //public User insertUser(String[][] userList);  
    public int insertOne(User user);
    public int deleteUserById(Integer userId);
    public int updateUser(User user);
	public void insertOnes(List<User> ones);
  
}  