package com.simplilearn.htmljavascript;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlJavascriptController {

	@GetMapping("/javascriptdom")
	public String javascriptdomView() {
		return "javascriptdom";
	}
}
