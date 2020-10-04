package com.capgemini.map;

public class MoodAnalyser {
	
	private String message;

	public MoodAnalyser() {
	}
	
	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() {
		if (message.contains("happy")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}
}
