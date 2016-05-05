package uk.co.bbc.training;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	@ResponseBody
	public String index() {
		return "<h1>Hello Fellow Citizen of The Crown !!!</h1>\n";
	}

}
