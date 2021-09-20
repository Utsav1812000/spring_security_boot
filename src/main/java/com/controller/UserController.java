package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.UserEntity;
import com.repository.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserRepository userRepository;

	@GetMapping("/signup")
	public String Signup() {
		System.out.println("Inside Signup.");
		return "signup";
	}

	@GetMapping("/loginuser")
	public String LoginUser() {
		System.out.println("Inside Login User.");
		return "login";
	}

	@PostMapping("/login1")
	public String Login(UserEntity userEntity, Model model) {
		System.out.println("Inside Login.");
		UserEntity user = userRepository.findByEmail(userEntity.getEmail());
		if (user != null) {
			if (user.getEmail().equals(userEntity.getEmail()) && user.getPassword().equals(userEntity.getPassword())) {
				model.addAttribute("user", user);
				return "profile";
			} else {
				model.addAttribute("error", "Password Invalid");
				return "login";
			}

		} else {
			model.addAttribute("error", "UserName or Password Invalid");
			return "login";
		}
	}

	@PostMapping("/saveuser")
	public String SaveUser(UserEntity userEntity) {
		System.out.println("Inside Save User.");
		userRepository.save(userEntity);
		return "login";
	}

	@GetMapping("/update/{id}")
	public String Update(@PathVariable("id") int id, Model model) {
		UserEntity userEntity = userRepository.getById(id);
		model.addAttribute("user", userEntity);
		return "updateUser";

	}

	@PostMapping("/updateuser")
	public String UpdateUser(UserEntity userEntity, Model model) {
		userRepository.save(userEntity);
		model.addAttribute("user", userEntity);
		return "profile";
	}

}
