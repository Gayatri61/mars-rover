package com.gayatri.marsrover.dto;

import java.io.Serializable;

import com.gayatri.marsrover.enums.Directions;

public class MarsRoverResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private float roverPositionX;
	
	private float roverPositionY;
	
	private Directions direction;

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

	public Directions getDirection() {
		return direction;
	}

	public void setDirection(Directions direction) {
		this.direction = direction;
	}
	
	
}
