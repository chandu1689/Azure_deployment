package com.donateblood.com.donateblood.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class DonateBloodController {

	@GetMapping("/getCountries")
	public ResponseEntity<String> getCountries() {
		log.info("insid the controller");
		return ResponseEntity.status(HttpStatus.OK).body("working");
	}

}
