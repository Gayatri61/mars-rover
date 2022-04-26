package com.gayatri.marsrover.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gayatri.marsrover.dto.MarsRoverRequest;
import com.gayatri.marsrover.dto.MarsRoverResponse;
import com.gayatri.marsrover.exception.InvalidInputException;
import com.gayatri.marsrover.service.MarsRoverService;

@RestController
@RequestMapping("/mars/rover")
public class MarsRoverController {

	@Autowired
	private MarsRoverService marsRoverService;
	
	@PostMapping("/function")
	public ResponseEntity<MarsRoverResponse> marsRoverFunction(@RequestBody MarsRoverRequest marsRoverRequest)throws  InvalidInputException {
		MarsRoverResponse marsRoverResponse=marsRoverService.marsRoverFunction(marsRoverRequest);
		return new ResponseEntity<MarsRoverResponse>(marsRoverResponse,HttpStatus.OK);
	}
}
