package mood;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class MoodUC2Test 
{
	@Test
	public void print_Welcome_Message() {
		MoodUC2 mood = new MoodUC2();
		mood.PrintWelcomeMessage();
	}
	@Test 
	public void Given_Message_When_Sad_Should_Return_Sad() {
		MoodUC2 moodAnalyser= new MoodUC2();
		String mood = moodAnalyser.AnalyseMood("Sad Message");
		Assert.assertEquals("SAD", mood);
	}

	@Test 
	public void Given_Message_When_Happy_Should_Return_Happy() {
		MoodUC2 moodAnalyser= new MoodUC2();
		String mood = moodAnalyser.AnalyseMood("Happy Message");
		Assert.assertEquals("HAPPY", mood);
	}
	
	@Test 
	public void Given_Message_When_Null_Should_Return_Happy() {
		MoodUC2 moodAnalyser= new MoodUC2();
		String mood = moodAnalyser.AnalyseMood(null);
		Assert.assertEquals("HAPPY", mood);
	}
}
