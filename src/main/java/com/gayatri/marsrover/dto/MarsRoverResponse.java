package com.gayatri.marsrover.dto;

import java.io.Serializable;

public class MarsRoverResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private float roverPositionX;
	
	private float roverPositionY;
	
	private String direction;
	
	public MarsRoverResponse() {
	}
		

	public MarsRoverResponse(float roverPositionX, float roverPositionY, String direction) {
		super();
		this.roverPositionX = roverPositionX;
		this.roverPositionY = roverPositionY;
		this.direction = direction;
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

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}


	@Override
	public String toString() {
		return "MarsRoverResponse [roverPositionX=" + roverPositionX + ", roverPositionY=" + roverPositionY
				+ ", direction=" + direction + "]";
	}


	
	
}
