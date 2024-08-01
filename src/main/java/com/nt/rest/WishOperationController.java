package com.nt.rest;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WishOperationController {

	@GetMapping("/home")
	public ResponseEntity<String> info() {
		return new ResponseEntity<String>("welcome to REST API ", HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/MVCCore")
	public String info1() {
		return "MVCCore";
	}
}
 