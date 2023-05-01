package com.example.poc.samplepoc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleRestController {

	@GetMapping("/message")
	public String getSampleMessage() {
		return "Hello World!";
	}
}
