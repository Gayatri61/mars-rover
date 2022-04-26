package com.gayatri.marsrover.factory;

import org.springframework.stereotype.Component;

import com.gayatri.marsrover.enums.Instruction;

@Component
public class OperationFactory {
	
	   public Operation getOperation (Instruction operationInstruction){
		      	
		      if(Instruction.LEFT.equals(operationInstruction)){
		         return new Left();
		         
		      } else if(Instruction.RIGHT.equals(operationInstruction)){
		         return new Right();
		         
		      } else if(Instruction.MOVE.equals(operationInstruction)){
		         return new Move();
		      }
		      
		      return null;
		   }

}
