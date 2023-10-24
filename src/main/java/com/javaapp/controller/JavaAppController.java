package com.javaapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class JavaAppController {
	@GetMapping(path="/japp")
	public String hai() {
		return "Its Sharan";
	}

}
