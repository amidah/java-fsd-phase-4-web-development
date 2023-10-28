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
	
	@GetMapping("/bootstrap")
	public String bootstrapView() {
		return "bootstrap";
	}
	
	@GetMapping("/bootstrap_container_responsive")
	public String bootstrapContainerResponsiveView() {
		return "bootstrap_container_responsive";
	}

	@GetMapping("/responsivegrid")
	public String responsivegridView() {
		return "responsivegrid";
	}
	
	@GetMapping("/bootstrapform")
	public String bootstrapformView() {
		return "bootstrapform";
	}
	
	@GetMapping("/bootstrapformvalidation")
	public String bootstrapvalidationformView() {
		return "bootstrapformvalidation";
	}
	
	@GetMapping("/bootstrapregistrationform")
	public String bootstrapregistrationformView() {
		return "bootstrapregistrationform";
	}
	
	@GetMapping("/bootstrapprogressbar")
	public String bootstrapprogressbarView() {
		return "bootstrapprogressbar";
	}
	
	@GetMapping("/bootstrapjumbotron")
	public String bootstrapjumbotronView() {
		return "bootstrapjumbotron";
	}
	
	@GetMapping("/bootstrapalert")
	public String bootstrapalertView() {
		return "bootstrapalert";
	}

}
