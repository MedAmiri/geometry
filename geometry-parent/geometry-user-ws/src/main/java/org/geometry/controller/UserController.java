package org.geometry.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class UserController {
	
	@RequestMapping(value = "/user", method = {RequestMethod.GET})
    public String get(@Valid @PathVariable String name) {
        return "Hello, " + name + "!";
	}
	
	@RequestMapping(value = "/sign", method = {RequestMethod.POST})
    public String create(@Valid @PathVariable String name) {
        return "Hello, " + name + "!";
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

