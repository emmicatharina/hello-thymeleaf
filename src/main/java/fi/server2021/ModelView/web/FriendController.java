package fi.server2021.ModelView.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FriendController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String friendForm(Model model) {
		
		return "friendlist";
	}
}
