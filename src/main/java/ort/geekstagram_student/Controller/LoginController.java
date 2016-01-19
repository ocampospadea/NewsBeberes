package ort.geekstagram_student.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/home")
    public String mainPage() {
        return "home";
    }
     
    @RequestMapping(value="/index")
    public String indexPage(Model model) {
    	model.addAttribute("error","erreur");
        return "home";
    }
       
  
}
