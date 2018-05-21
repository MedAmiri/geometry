package org.geometry.controller;

import javax.validation.Valid;

import org.geometry.user.entities.User;
import org.geometry.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/user/{id}", method = {RequestMethod.GET}, produces = "application/json; charset=UTF-8")
    public ResponseEntity<User> get(@Valid @PathVariable(name = "id") Long id) {
		User user = userService.findUserById(id);
        return ResponseEntity.ok().body(user);
	}
	
	@RequestMapping(value = "/sign", method = {RequestMethod.POST}, produces = "application/json; charset=UTF-8")
    public ResponseEntity<Void> create(@Valid @RequestBody User user) {
        userService.SaveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(null) ;
	}
	
	@RequestMapping(value = "/connect", method = {RequestMethod.POST})
    public String connect( @Valid @PathVariable String name) {
        return "Hello, " + name + "!";
	}
	
	@RequestMapping(value = "/modify", method = {RequestMethod.PUT})
    public String modify( @Valid @PathVariable String name) {
        return "Hello, " + name + "!";
	}
	
	@RequestMapping(value = "/reset", method = {RequestMethod.POST})
    public String reset( @Valid @PathVariable String name) {
        return "Hello, " + name + "!";
	}
	
	@RequestMapping(value = "/delete", method = {RequestMethod.DELETE})
    public String delete( @Valid @PathVariable String name) {
        return "Hello, " + name + "!";
	}
}

