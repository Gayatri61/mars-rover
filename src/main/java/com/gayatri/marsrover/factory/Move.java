package com.gayatri.marsrover.factory;

import org.springframework.stereotype.Component;

import com.gayatri.marsrover.dto.MarsRoverRequest;
import com.gayatri.marsrover.enums.Direction;

@Component
public class Move implements Operation{

	@Override
	public MarsRoverRequest doAction(MarsRoverRequest marsRoverRequest) {
		
        if(marsRoverRequest.getDirection() == Direction.N) {
            marsRoverRequest.setRoverPositionY(marsRoverRequest.getRoverPositionY()+1);
        } else if(marsRoverRequest.getDirection() == Direction.S) {
        	marsRoverRequest.setRoverPositionY(marsRoverRequest.getRoverPositionY()-1);
        } else if(marsRoverRequest.getDirection() == Direction.E) {
        	marsRoverRequest.setRoverPositionX(marsRoverRequest.getRoverPositionX()+1);
        } else if(marsRoverRequest.getDirection() == Direction.W) {
        	marsRoverRequest.setRoverPositionX(marsRoverRequest.getRoverPositionX()-1);
        }
        return marsRoverRequest;
		
	}

}
