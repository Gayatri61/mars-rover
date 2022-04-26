package com.gayatri.marsrover.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gayatri.marsrover.dto.MarsRoverRequest;
import com.gayatri.marsrover.dto.MarsRoverResponse;
import com.gayatri.marsrover.exception.InvalidInputException;

@RestController
@RequestMapping("/mars/rover")
public class MarsRoverController {

	@PostMapping("/test")
	public ResponseEntity<MarsRoverResponse> testMarsRover(@RequestBody MarsRoverRequest MarsRoverRequest)throws  InvalidInputException {
		return null;
		
	}
}
