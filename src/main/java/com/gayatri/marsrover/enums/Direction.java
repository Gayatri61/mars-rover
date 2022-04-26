package com.gayatri.marsrover.enums;

public enum Direction {
	NORTH("N"),
	SOUTH("S"),
	EAST("E"),
	WEST("W");
	
    public final String value;

    private Direction(String value) {
        this.value = value;
    }
    
    public static Direction getDirection(String value) {
        for (Direction d : values()) {
            if (d.value.equals(value)) {
                return d;
            }
        }
        return null;
    }
}
