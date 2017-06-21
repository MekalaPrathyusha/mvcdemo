package com.niit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//<bean id="homeController" class="com.niit.controllers.HomeController"></bean>
public class HomeController {
	//http://localhost:8010/mvcdemo/home
  @RequestMapping("/home")
	public String gethomePage(){
		return "home";
		//WEB-INF/pages/homePage.jsp
  }
}


