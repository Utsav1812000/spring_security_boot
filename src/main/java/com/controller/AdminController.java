package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.UserEntity;
import com.repository.UserRepository;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/login1")
	@ResponseBody
	public String Login() {
		return "Admin Login.";
	}
	
	@GetMapping("/signup")
	@ResponseBody
	public String Signup() {
		return "Admin Signup.";
	}
	
	@GetMapping("/profile")
	@ResponseBody
	public String Profile() {
		return "Admin Profile.";
	}
	
	@GetMapping("/listusers")
	public String ListUsers(Model model) {
		List<UserEntity> list = userRepository.findAll();
		model.addAttribute("list", list);
		return "viewUsers";
	}

}
