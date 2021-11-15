package com.springMVCDemo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePage {

	@RequestMapping("/")
	public String Home()
	{
		return "main";
	}
	
}
