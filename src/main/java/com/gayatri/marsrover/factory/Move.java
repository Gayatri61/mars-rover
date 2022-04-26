package com.gayatri.marsrover.factory;

import org.springframework.stereotype.Component;

import com.gayatri.marsrover.dto.MarsRoverRequest;
import com.gayatri.marsrover.enums.Direction;
import com.gayatri.marsrover.exception.InvalidInputException;

@Component
public class Move implements Operation{

	@Override
	public MarsRoverRequest doAction(MarsRoverRequest marsRoverRequest) {
		Direction direction=Direction.getDirection(marsRoverRequest.getDirection());
        if(direction == Direction.NORTH) {
        	if(marsRoverRequest.getRoverPositionY()+1 > marsRoverRequest.getUpperRightY()) {
        		throw new InvalidInputException("Given Instruction crossing the upper Y coordinate limit");
        	}
            marsRoverRequest.setRoverPositionY(marsRoverRequest.getRoverPositionY()+1);
        } else if(direction == Direction.SOUTH) {
        	if(marsRoverRequest.getRoverPositionY()-1 < 0) {
        		throw new InvalidInputException("Given Instruction crossing the lower Y coordinate limit");
        	}
        	marsRoverRequest.setRoverPositionY(marsRoverRequest.getRoverPositionY()-1);
        } else if(direction == Direction.EAST) {
        	if(marsRoverRequest.getRoverPositionX()+1 > marsRoverRequest.getUpperRightX()) {
        		throw new InvalidInputException("Given Instruction crossing the upper X coordinate limit");
        	}
        	marsRoverRequest.setRoverPositionX(marsRoverRequest.getRoverPositionX()+1);
        } else if(direction == Direction.WEST) {
        	if(marsRoverRequest.getRoverPositionX()-1 < 0) {
        		throw new InvalidInputException("Given Instruction crossing the lower X coordinate limit");
        	}
        	marsRoverRequest.setRoverPositionX(marsRoverRequest.getRoverPositionX()-1);
        }
        return marsRoverRequest;
		
	}

}
