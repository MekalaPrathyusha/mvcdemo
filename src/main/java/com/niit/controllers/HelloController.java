package com.niit.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//<bean id="helloController" class="com.niit.controllers.HelloController"></bean>
public class HelloController {
	//http://localhost:8080/mvcdemo/hello
    @RequestMapping("/")
	public String helloPage(){
		return "helloPage";
		//WEB-INF/pages/helloPage.jsp
	}
    //http://localhost:8080/mvcdemo/welcome
	@RequestMapping("/welcome")
	public String welcome(){
		return "welcomePage";
		//WEB-INF/pages/welcomePage.jsp
	}
}
