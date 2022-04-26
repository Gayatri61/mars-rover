package com.gayatri.marsrover.factory;

import org.springframework.stereotype.Component;

import com.gayatri.marsrover.exception.InvalidInputException;

@Component
public class OperationFactory {
	
	   public Operation getMovment (String operationInstruction){
		      if(operationInstruction== null || operationInstruction.isEmpty()){
		         throw new InvalidInputException("Please provide input in given format only");
			   // throw exception
		      }		
		      if(operationInstruction.equalsIgnoreCase("L")){
		         return new Left();
		         
		      } else if(operationInstruction.equalsIgnoreCase("R")){
		         return new Right();
		         
		      } else if(operationInstruction.equalsIgnoreCase("M")){
		         return new Move();
		      }
		      
		      return null;
		   }

}
