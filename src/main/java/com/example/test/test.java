package com.example.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
	@GetMapping("/")
	public ResponseEntity<String> test(){
		return new ResponseEntity<String>("테스트 서버",HttpStatus.ACCEPTED);
	}
}
