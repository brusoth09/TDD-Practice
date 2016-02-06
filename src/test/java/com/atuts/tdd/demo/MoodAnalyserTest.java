package com.atuts.tdd.demo;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by BurusothmanA on 2/3/2016 2:18 PM.
 */
public class MoodAnalyserTest {
    @Test
    public void testMoodAnalysis() throws Exception {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String  mood = moodAnalyser.analyseMood("I'm Feeling Happy");

        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }
}
