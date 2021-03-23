package com.dodo.playcode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockcubeController {
	
	@GetMapping("/flash")
	public String getData() {
		return "A Message from Dockcube project-Controller class"; 
	}

}
