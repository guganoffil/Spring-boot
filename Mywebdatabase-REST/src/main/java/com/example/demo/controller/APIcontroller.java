package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repo.Userrepo;

@RestController
public class APIcontroller {
	@Autowired
	private Userrepo userrepo;
	
	@GetMapping(value = "/")
	public String getpage() {
		return "haigugan";
	}
	@GetMapping(value = "/users")
	public List<User> getuser() {
		return userrepo.findAll();
		
	}
	@PostMapping(value = "/save")
	public String saveuser(@RequestBody User user) {
		userrepo.save(user);
		return "record saved";
	
	}
	@PutMapping(value = "update/{id}")
	public String updateuser(@PathVariable long id,@RequestBody User user) {
		User updateuser= userrepo.findById(id).get();
		updateuser.setName(user.getName());
		updateuser.setOccupation(user.getOccupation());
		userrepo.save(updateuser);
		
		return "record updated";
	
	}
	@DeleteMapping(value = "/delete/{id}")
	public String deleteuser(@PathVariable long id) {
		User deleteuser = userrepo.findById(id).get();
		userrepo.delete(deleteuser);
		return "record deleted";
	
	}

}
