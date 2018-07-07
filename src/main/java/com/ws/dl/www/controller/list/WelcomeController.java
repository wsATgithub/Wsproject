package com.ws.dl.www.controller.list;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ws.dl.www.db.MySQLConnector;
import com.ws.dl.www.form.LoginForm;

@Controller
@RequestMapping(value = "/list")
public class WelcomeController {

	@RequestMapping(value = "/welcome", method = RequestMethod.POST)
	public String list(LoginForm form,Model model) {

		String name = MySQLConnector.getName(form.getName());
		model.addAttribute("loginName", name);
		return "list/welcome";
	}

}
