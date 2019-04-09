package cn.sh.translateControll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebPageController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homepage() {
		return "/index.html";
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String logout() {
		return "/index.html";
	}

}
