package com.gayatri.marsrover.factory;

import org.springframework.stereotype.Component;

import com.gayatri.marsrover.dto.MarsRoverRequest;
import com.gayatri.marsrover.enums.Direction;

@Component
public class Right implements Operation{

	@Override
	public MarsRoverRequest doAction(MarsRoverRequest marsRoverRequest) {
		Direction direction=Direction.getDirection(marsRoverRequest.getDirection());
		if (direction == Direction.NORTH) {
            direction = Direction.EAST;
        } else if (direction == Direction.SOUTH) {
            direction = Direction.WEST;
        } else if (direction == Direction.EAST) {
            direction = Direction.SOUTH;
        } else if (direction == Direction.WEST) {
            direction = Direction.NORTH;
        }
        marsRoverRequest.setDirection(direction.value);
		return marsRoverRequest;
		
	}

}
