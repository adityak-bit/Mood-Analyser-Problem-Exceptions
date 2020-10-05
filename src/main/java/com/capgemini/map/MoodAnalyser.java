package com.capgemini.map;

public class MoodAnalyser {
	
	
	private String message;

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() {
		try {
			if (message.contains("happy"))
				return "HAPPY";
			else
				return "SAD";
		} catch (NullPointerException e) {
			return "NULL";
		}
	}
}
