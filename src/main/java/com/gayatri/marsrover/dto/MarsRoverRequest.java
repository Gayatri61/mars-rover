package com.gayatri.marsrover.dto;

import java.io.Serializable;

import com.gayatri.marsrover.enums.Direction;

public class MarsRoverRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private float upperRightX;
	
	private float upperRightY;

	private float roverPositionX;
	
	private float roverPositionY;
	
	private Direction direction;
	
	private String Instruction;

	public float getUpperRightX() {
		return upperRightX;
	}

	public void setUpperRightX(float upperRightX) {
		this.upperRightX = upperRightX;
	}

	public float getUpperRightY() {
		return upperRightY;
	}

	public void setUpperRightY(float upperRightY) {
		this.upperRightY = upperRightY;
	}

	public float getRoverPositionX() {
		return roverPositionX;
	}

	public void setRoverPositionX(float roverPositionX) {
		this.roverPositionX = roverPositionX;
	}

	public float getRoverPositionY() {
		return roverPositionY;
	}

	public void setRoverPositionY(float roverPositionY) {
		this.roverPositionY = roverPositionY;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public String getInstruction() {
		return Instruction;
	}

	public void setInstruction(String instruction) {
		Instruction = instruction;
	}
	
	
}
