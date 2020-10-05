package com.capgemini.map;

class CustomException {

	static void validateInput() throws invalidInputException {
		if(message == null || !(message.contains("happy")) || !(message.contains("sad")) ) {
			throw new invalidInputException("Exception");
		}
		System.out.println("Valid input");
	}
	
	public static void main(String[] args) {
		
	}
				
}

class invalidInputException extends Exception{
	invalidInputException(String exceptionText) {
		super(exceptionText);
	}
	} 
}