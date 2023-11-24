package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String login() {
		return "Login";
	}

	@GetMapping("/agentLogin")
	public String agentLogin() {
		return "agentLogin";
	}

	@GetMapping("/forgotPass")
	public String forgotPass() {
		return "forgot";
	}

	@GetMapping("/register")
	public String register() {
		return "register";
	}

	@PostMapping("/SignIn")
	public String index(@RequestParam String username, String password) {
		System.out.println(username + "" + password);
		if (username.equals("Demo") && password.equals("8765")) {
			return "redirect:index";
		} else {
			return "redirect:login";
		}
	}

	@GetMapping("/index")
	public String index() {
		System.out.println("ok");
		return "index";
	}

}
