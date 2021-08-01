package com.matosic.UserF.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matosic.UserF.entities.User;
import com.matosic.UserF.repositories.UserRepo;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserRepo ur;
	
	@GetMapping("/svi")
	public List<User> vratiSve() {
		return ur.findAll();
	}
	
	@GetMapping("/{id}")
	public User vratiJednog(@PathVariable int id) {
		return ur.findById(id).orElse(null);
	}
	
	@PostMapping("/novi")
	public User napraviNovog(@RequestBody User user) {
		return ur.save(user);
	}
	
	
}