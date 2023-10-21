package com.simplilearn.html5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {
	
	@GetMapping("/semantic")
	public String semancticView() {
		return "semantic";
	}
	
	@GetMapping("/audiovideo")
	public String audioVideoView() {
		return "audiovideo";
	}

}
