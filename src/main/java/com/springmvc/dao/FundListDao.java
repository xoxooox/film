package com.springmvc.dao;

import com.mysql.fabric.xmlrpc.base.Array;
import com.springmvc.domain.FundList;;  

/** 
 * 功能概要：FundList的DAO类 
 *  
 * @author guanjian 
 * @since 2017年8月18日 
 */  
public interface FundListDao {  
    /** 
     *  
	 * @author guanjian 
	 * @since 2017年8月18日 
     * @param userId 
     * @return 
     */  
    public FundList insertFundList(Array fundData);  
  
}  