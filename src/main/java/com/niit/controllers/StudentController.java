package com.niit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.Student;

@Controller
public class StudentController {
	//http://localhost:8010/mvcdemo/getStudentForm
@RequestMapping("/getStudentForm")
	public String getStudentForm(Model model){
		model.addAttribute("student", new Student());
		return "studentform";
		
	}

@RequestMapping("/processStudentData")
public ModelAndView readData(@ModelAttribute(value="student") Student student,Model model){
	return new ModelAndView("studentdetails","student",student);
	
	
}
}
