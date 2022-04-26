package com.gayatri.marsrover.factory;

import org.springframework.stereotype.Component;

import com.gayatri.marsrover.dto.MarsRoverRequest;
import com.gayatri.marsrover.enums.Direction;

@Component
public class Left implements Operation{

	@Override
	public MarsRoverRequest doAction(MarsRoverRequest marsRoverRequest ) {
		Direction direction=Direction.getDirection(marsRoverRequest.getDirection());
        if (direction == Direction.NORTH) {
            direction = Direction.WEST;
        } else if (direction == Direction.SOUTH) {
            direction = Direction.EAST;
        } else if (direction == Direction.EAST) {
            direction = Direction.NORTH;
        } else if (direction == Direction.WEST) {
            direction = Direction.SOUTH;
        }
        marsRoverRequest.setDirection(direction.value);
		return marsRoverRequest;
		
	}

}
