package com.springmvc.domain;

/** 
 * FundList映射类 
 *  
 * @author guanjian 
 * @time 2017.8.18 
 */  
public class FundList {  
    private Integer id;  
    private String fundName;  
    private String amount;   
    private Integer time;
    private Integer creatTime;
    private Integer percent;
    private Integer fundId;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFundName() {
		return fundName;
	}
	public void setFundName(String fundName) {
		this.fundName = fundName;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public Integer getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}
	public Integer getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(Integer creatTime) {
		this.creatTime = creatTime;
	}
	public Integer getPercent() {
		return percent;
	}
	public void setPercent(Integer percent) {
		this.percent = percent;
	}
	public Integer getFundId() {
		return fundId;
	}
	public void setFundId(Integer fundId) {
		this.fundId = fundId;
	}
    
	@Override  
    public String toString() {  
        return "FundList ";  
    }  
    
}
  