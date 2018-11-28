package co.grandcircus.University;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller 
public class AdminController {
	
	@Autowired
	//TODO Dao dao;
	
	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");
	}
	
	

}
