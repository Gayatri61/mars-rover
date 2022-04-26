package com.gayatri.marsrover.factory;

import org.springframework.stereotype.Component;

import com.gayatri.marsrover.dto.MarsRoverRequest;
import com.gayatri.marsrover.enums.Direction;

@Component
public class Right implements Operation{

	@Override
	public MarsRoverRequest doAction(MarsRoverRequest marsRoverRequest) {
        Direction direction=marsRoverRequest.getDirection();
		if (direction == Direction.N) {
            direction = Direction.E;
        } else if (direction == Direction.S) {
            direction = Direction.W;
        } else if (direction == Direction.E) {
            direction = Direction.S;
        } else if (direction == Direction.W) {
            direction = Direction.N;
        }
        marsRoverRequest.setDirection(direction);
		return marsRoverRequest;
		
	}

}
