package com.gayatri.marsrover.service.impl;

import org.springframework.stereotype.Component;

import com.gayatri.marsrover.dto.MarsRoverRequest;
import com.gayatri.marsrover.dto.MarsRoverResponse;
import com.gayatri.marsrover.enums.Direction;
import com.gayatri.marsrover.enums.Instruction;
import com.gayatri.marsrover.exception.InvalidInputException;
import com.gayatri.marsrover.factory.Operation;
import com.gayatri.marsrover.factory.OperationFactory;
import com.gayatri.marsrover.service.MarsRoverService;

@Component
public class MarsRoverServiceImpl implements MarsRoverService{

	@Override
	public MarsRoverResponse marsRoverFunction(MarsRoverRequest marsRoverRequest) {
		
		if(marsRoverRequest.getInstruction()==null || marsRoverRequest.getInstruction().isBlank()) {
			throw new InvalidInputException("Please provide instruction.");
		}
		
		validateInputDirection(marsRoverRequest);
		for(char ch:marsRoverRequest.getInstruction().toCharArray()) {
			Instruction instruction = validateInstructionInput(ch);		// validate given instruction like LLMMLLMMR
			OperationFactory operationFactory=new OperationFactory();	
			Operation op=operationFactory.getOperation(instruction);	// get the object according to instruction (used factory method design patteren)
			marsRoverRequest =op.doAction(marsRoverRequest);			// perform operation according given instruction 
		}
		return createResponse(marsRoverRequest);
	}

	private Instruction validateInstructionInput(char ch) {
		Instruction instruction =Instruction.getInstruction(String.valueOf(ch));
		if(instruction==null) {
			throw new InvalidInputException("Instruction should contain only L, R, M");
		}
		return instruction;
	}

	private void validateInputDirection(MarsRoverRequest marsRoverRequest) {
		Direction direction=Direction.getDirection(marsRoverRequest.getDirection());
		if(direction==null) {
			throw new InvalidInputException("Direction should be either of :"+ Direction.values().toString());
		}
	}

	private MarsRoverResponse createResponse(MarsRoverRequest marsRoverRequest) {
		MarsRoverResponse marsRoverResponse=new MarsRoverResponse();
		marsRoverResponse.setDirection(marsRoverRequest.getDirection());
		marsRoverResponse.setRoverPositionX(marsRoverRequest.getRoverPositionX());
		marsRoverResponse.setRoverPositionY(marsRoverRequest.getRoverPositionY());
		return marsRoverResponse;
	}

}
