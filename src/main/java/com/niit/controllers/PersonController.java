package com.niit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.model.Person;
import com.niit.services.PersonService;


@Controller
public class PersonController {
	@Autowired
	private PersonService personService;
	
	//personController.setPersonService(new PersonServiceImple())
	
	 //http://localhost:8010/mvcdemo/personForm
	@RequestMapping("/personForm")
	public String getPersonForm(Model model) {
		model.addAttribute("personObj",new Person());  // firstname,lastname,email and phone are null
		return "personForm";
	}
	//personObj - to read the value from spring form fields
	//person - to send the value to the persondetails.jsp
    @RequestMapping("/processPersonDetails")  // firstname,lastname,email and phone has some values
    public String getPersonDetails(@ModelAttribute(value="personObj") Person person, Model model){
    	personService.savePerson(person);
    	
        model.addAttribute("person", person);
        return "persondetails";
   }
}
