package com.gayatri.marsrover.enums;

public enum Instruction {
 LEFT("L"),
 RIGHT("R"),
 MOVE("M");
	
    public final String value;

    private Instruction(String value) {
        this.value = value;
    }
    
    public static Instruction getInstruction(String value) {
        for (Instruction i : values()) {
            if (i.value.equals(value)) {
                return i;
            }
        }
        return null;
    }
}
