/**
 * @author guanjian
 *
 */

package com.springmvc.controller;
import org.springframework.stereotype.Controller;  
//import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
//import org.springframework.web.bind.annotation.RequestMethod;  
@Controller
public class  demoController{
    @RequestMapping("/index")
    public String index(){
        return "demo";
    }
}