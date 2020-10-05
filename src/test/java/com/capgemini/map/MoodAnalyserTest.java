package com.capgemini.map;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	
	@Test
	public void testMoodAnalysis() {
		
			MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
			MoodAnalyser moodAnalyser1 = new MoodAnalyser(null);

			String mood = moodAnalyser.analyseMood();
			String mood1 = moodAnalyser1.analyseMood();

			Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
			Assert.assertThat(mood1, CoreMatchers.is("HAPPY"));    
	}
}
