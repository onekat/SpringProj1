package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/greeting")
	public String sayHello(Model model) { /*@RequestMapping annotation ties this code to a web page*/
		
		model.addAttribute("greeting", "Hello World"); /*model is a hash map (key/value pairs): key='greeting', value='Hello World'*/
		return "Hello";

	/* convension: put all jsp pages under the WEB-INF directory */
	/* control spacebar will resolve dependencies */
	}
}
