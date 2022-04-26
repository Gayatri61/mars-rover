package com.gayatri.marsrover.factory;

import org.springframework.stereotype.Component;

import com.gayatri.marsrover.dto.MarsRoverRequest;
import com.gayatri.marsrover.enums.Direction;

@Component
public class Left implements Operation{

	@Override
	public MarsRoverRequest doAction(MarsRoverRequest marsRoverRequest ) {
		Direction direction=marsRoverRequest.getDirection();
        if (direction == Direction.N) {
            direction = Direction.W;
        } else if (direction == Direction.S) {
            direction = Direction.E;
        } else if (direction == Direction.E) {
            direction = Direction.N;
        } else if (direction == Direction.W) {
            direction = Direction.S;
        }
        marsRoverRequest.setDirection(direction);
		return marsRoverRequest;
		
	}

}
