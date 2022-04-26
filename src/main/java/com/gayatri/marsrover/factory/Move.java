package com.gayatri.marsrover.factory;

import org.springframework.stereotype.Component;

import com.gayatri.marsrover.dto.MarsRoverRequest;
import com.gayatri.marsrover.enums.Direction;

@Component
public class Move implements Operation{

	@Override
	public MarsRoverRequest doAction(MarsRoverRequest marsRoverRequest) {
		Direction direction=Direction.getDirection(marsRoverRequest.getDirection());
        if(direction == Direction.NORTH) {
            marsRoverRequest.setRoverPositionY(marsRoverRequest.getRoverPositionY()+1);
        } else if(direction == Direction.SOUTH) {
        	marsRoverRequest.setRoverPositionY(marsRoverRequest.getRoverPositionY()-1);
        } else if(direction == Direction.EAST) {
        	marsRoverRequest.setRoverPositionX(marsRoverRequest.getRoverPositionX()+1);
        } else if(direction == Direction.WEST) {
        	marsRoverRequest.setRoverPositionX(marsRoverRequest.getRoverPositionX()-1);
        }
        return marsRoverRequest;
		
	}

}
