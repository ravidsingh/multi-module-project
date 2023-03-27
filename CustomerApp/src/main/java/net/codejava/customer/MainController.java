package net.codejava.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.codejava.lib.CommonUtil;

@Controller
public class MainController {
	
	// customer app controller
	@GetMapping("")
	public String viewHomePage(Model model) {
		String appName = CommonUtil.getAppName();
		
		model.addAttribute("appName", appName);
		
		return "index";
	}
}
