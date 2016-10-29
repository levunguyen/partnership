package org.hocviencntt.web.controller;

import java.util.List;

import org.hocviencntt.user.model.User;
import org.hocviencntt.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomePage {
	
	@Autowired
	UserService userService;



   @RequestMapping(value ="/", method = RequestMethod.GET)
   public String homePage(Model model) {
//	   List<User> users = userService.findPartnerSuggest();
//	   model.addAttribute("usersSuggest" , users);
       return "home";
   }
   
	 
}
