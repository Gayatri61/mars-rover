package com.gayatri.marsrover.factory;

import com.gayatri.marsrover.dto.MarsRoverRequest;

public interface Operation {
	
	public MarsRoverRequest doAction(MarsRoverRequest marsRoverRequest);

}
