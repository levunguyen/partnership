package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomePage {

/*	@RequestMapping(value="/home",method =RequestMethod.GET)
	public String homePage(){
		return "home";
	}*/

   @RequestMapping(value ="/home", method = RequestMethod.GET)
   public String homePage(Model model) {
       return "home";
   }
	 
}