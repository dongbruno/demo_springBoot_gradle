package com.example.demo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@SpringBootApplication
public class DemoSpringBootGradleApplication {
 
	Logger logger = LoggerFactory.getLogger(DemoSpringBootGradleApplication.class);
	@Value("${name}")
	private String admin;
	@RequestMapping("/test")
	  public String index(Model model) {  
	    model.addAttribute("loginName", admin);  
	    model.addAttribute("loginId", "25");  
	    return "index";  
	  }  
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootGradleApplication.class, args);
	}
}
