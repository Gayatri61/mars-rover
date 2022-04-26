package com.gayatri.marsrover.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import com.gayatri.marsrover.dto.MarsRoverRequest;
import com.gayatri.marsrover.dto.MarsRoverResponse;
import com.gayatri.marsrover.exception.InvalidInputException;

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
	
	@Test()
	public void testMarsRoverFunction_InvalidDirection() {
		marsRoverRequest=new MarsRoverRequest(5, 5, 1, 2, null, "LMLMLMLMM");
		assertThrows(InvalidInputException.class, ()->{marsRoverServiceImpl.marsRoverFunction(marsRoverRequest);});
		
		marsRoverRequest=new MarsRoverRequest(5, 5, 1, 2, "", "LMLMLMLMM");
		assertThrows(InvalidInputException.class, ()->{marsRoverServiceImpl.marsRoverFunction(marsRoverRequest);});
		
		marsRoverRequest=new MarsRoverRequest(5, 5, 1, 2, "K", "LMLMLMLMM");
		assertThrows(InvalidInputException.class, ()->{marsRoverServiceImpl.marsRoverFunction(marsRoverRequest);});
	}
	
	@Test()
	public void testMarsRoverFunction_InvalidInstruction() {
		marsRoverRequest=new MarsRoverRequest(5, 5, 1, 2, "N", null);
		assertThrows(InvalidInputException.class, ()->{marsRoverServiceImpl.marsRoverFunction(marsRoverRequest);});
		
		marsRoverRequest=new MarsRoverRequest(5, 5, 1, 2, "N", "");
		assertThrows(InvalidInputException.class, ()->{marsRoverServiceImpl.marsRoverFunction(marsRoverRequest);});
		
		marsRoverRequest=new MarsRoverRequest(5, 5, 1, 2, "N", "KKKKKKKK");
		assertThrows(InvalidInputException.class, ()->{marsRoverServiceImpl.marsRoverFunction(marsRoverRequest);});
	}
	
	@Test
	public void testMarsRoverFunction_crossingLimit() {
		marsRoverRequest=new MarsRoverRequest(5, 5, 1, 2, "N", "LMLMLMLMMMMMMM");
		assertThrows(InvalidInputException.class, ()->{marsRoverServiceImpl.marsRoverFunction(marsRoverRequest);});
		
		marsRoverRequest=new MarsRoverRequest(5, 5, 1, 2, "W", "LMLMLMLMMMMMMM");
		assertThrows(InvalidInputException.class, ()->{marsRoverServiceImpl.marsRoverFunction(marsRoverRequest);});
		
		marsRoverRequest=new MarsRoverRequest(5, 5, 1, 2, "S", "LMLMLMLMMMMMMM");
		assertThrows(InvalidInputException.class, ()->{marsRoverServiceImpl.marsRoverFunction(marsRoverRequest);});
		
		marsRoverRequest=new MarsRoverRequest(5, 5, 1, 2, "E", "LMLMLMLMMMMMMM");
		assertThrows(InvalidInputException.class, ()->{marsRoverServiceImpl.marsRoverFunction(marsRoverRequest);});
	}

}
