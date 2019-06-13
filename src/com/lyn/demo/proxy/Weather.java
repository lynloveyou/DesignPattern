package com.lyn.demo.proxy;

/**  
* 代理模式  
*  
* 为其他对象提供一个代理以控制这个对象的访问  
*  
*/   
/** 
 *  抽象主题角色(Subject):天气 
 * 
 */ 
public interface Weather {
	
	/**
	 * 请求城市
	 * @param city
	 */
    public void request(String id,String city);  
    
	/**
	 * 显示城市
	 * @param city
	 */
    public void display(String id,String city);  
    
	/**
	 * 是否为有效城市
	 * @param city
	 */
    public boolean isValidCity(String id,String city);  

}
