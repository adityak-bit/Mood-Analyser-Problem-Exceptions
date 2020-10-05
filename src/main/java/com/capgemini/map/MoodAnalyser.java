package com.capgemini.map;

class MoodAnalyser {
	private String message;
	
	public MoodAnalyser() {}
	
	public MoodAnalyser(String message) {
		this.message = message;
	}
	
	public String analyseMood(String message) throws MoodAnalyserException{
		this.message = message;
		return analyseMood();
	}
	public String analyseMood() throws MoodAnalyserException {
		try {
			if(message.length() == 0)
				throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY,"Enter some message");
			if(message.contains("happy"))
					return "SAD";
			else
				return "HAPPY";
		}catch(NullPointerException e) {
			throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"Enter proper message");
		}
	}
}
