package com.capgemini.map;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	@Test
	public void testMoodAnalysis() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("");

		String mood = moodAnalyser.analyseMood();

		Assert.assertThat(mood, CoreMatchers.is("SAD"));
	}
}
