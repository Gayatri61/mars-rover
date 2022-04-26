package com.gayatri.marsrover.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import com.gayatri.marsrover.dto.MarsRoverRequest;
import com.gayatri.marsrover.dto.MarsRoverResponse;

@ExtendWith(MockitoExtension.class)
public class MarsRoverServiceTest {
	
	@InjectMocks 
	private MarsRoverServiceImpl marsRoverServiceImpl;
	
	MarsRoverRequest marsRoverRequest=new MarsRoverRequest();
	
	MarsRoverResponse marsRoverExpectedResponse=new MarsRoverResponse();
	
	
	@Test
	public void testMarsRoverFunction_basic() {
		marsRoverRequest=new MarsRoverRequest(5, 5, 1, 2, "N", "LMLMLMLMM");
		MarsRoverResponse response=marsRoverServiceImpl.marsRoverFunction(marsRoverRequest);
		marsRoverExpectedResponse=new MarsRoverResponse(1, 3, "N");
		assertEquals(marsRoverExpectedResponse.toString(), response.toString());
	}

}
