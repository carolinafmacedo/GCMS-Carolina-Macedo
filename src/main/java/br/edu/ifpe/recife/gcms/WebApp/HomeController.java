package br.edu.ifpe.recife.gcms.WebApp; 
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody; 
 
@Controller 
public class HomeController { 
 
  @RequestMapping("/") 
  public @ResponseBody String greeting() { 
    return "Hello, World!!"; 
  }
  
  @RequestMapping("/ramide") 
  public @ResponseBody String greetingRamide() { 
    return "Hello, Ramide!!!!!"; 
  }
  
  @RequestMapping("/ramide_branch") 
  public @ResponseBody String greetingRamideBranch() { 
    return "Hello, Ramide! (branch)"; 
  }
  
  
  @RequestMapping("/carolina")
  public @ResponseBody String greetingCarolina() {
	return "Hello, Carolina!!";
  }
  
  
}  