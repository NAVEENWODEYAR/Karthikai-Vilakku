package com.bhas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController 
{
	@GetMapping("/msg")
	public String wishMsg()
	{
		return "Welcome to Tiruvannamalai,";
	}
}
