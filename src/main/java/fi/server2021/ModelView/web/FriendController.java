package fi.server2021.ModelView.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FriendController {
	
	ArrayList<String> friends = new ArrayList<>();

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String friendForm(@RequestParam(name = "friend", required = false) String friend, Model model) {
		if (friend != null) {
			friends.add(friend);
		}
		model.addAttribute("friend", friend);
		model.addAttribute("friends", friends);
		return "friendlist";
	}
	
	
}
