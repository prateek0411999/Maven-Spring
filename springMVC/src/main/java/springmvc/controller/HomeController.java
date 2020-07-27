package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	//url ko handle krne k liye methods bnane hh yha
	//ab yeh method kab fire hoga uske liye
	//RequestMapping lagana hh  annoatation
	
//	@RequestMapping("/home")
//	public String home()
//	{
//		System.out.println("This is home url");
//		return "index";
//		
//		
//	}

	//yeh toh hogya jab apan home p redirect kre rhe toh 
	//hmara static data jaa rha 
	//apne apan object bhejenge
	
	//using MODEL
	//jo ki apne ko directly available rehta hh
	//and this MODEL has a addAttribute method(key,object) pair fir isko apan apne jsp page p use 
	//kr skte
	//ab jo bhi shika hh usko combine kr skte 
	//apna JdbcTemplate use krke ya Hibernate use krke apne database se object get kr skte fir usko apne jsp page p bhej skte
	
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		
		System.out.println("This is home url");
		
		model.addAttribute("name", "Prateek Sharma");
		//ab yeh model apne HttpServletRequest k request.getAttribute se nikal lenge jsp page p ez
		model.addAttribute("id", 100);
		//kuch bhi pass krke jsp page p get kr skte
		List<String> ls= new ArrayList<String>();
		ls.add("Hitesh");
		ls.add("Manik");
		ls.add("Ankit");
		
		model.addAttribute("ls", ls);
		return "index";
		
		
	}
}
