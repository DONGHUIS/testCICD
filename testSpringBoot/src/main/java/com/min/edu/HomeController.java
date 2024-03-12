package com.min.edu;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
public class HomeController {
	
	@GetMapping(value = "/")
	public String home() {
		return "redirect:/info.do";
	}
	
	@GetMapping(value = "/info.do")
	public String info() {
		return "info";
	}
}
