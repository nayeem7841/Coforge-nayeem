package com.springMVCDemo1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class Student {

	@RequestMapping("/form")
	public String student_detail(Model m)
	{
		m.addAttribute("ModelStudent",new ModelStudent());
		System.out.println("hello");
		return "Student-Form";
	}
	@RequestMapping("/submitform")
	public String student_form(@ModelAttribute("ModelStudent") ModelStudent temp)
	{
		return "Submited-form";
	}
	
}
