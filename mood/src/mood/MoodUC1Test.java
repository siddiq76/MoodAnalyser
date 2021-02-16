package mood;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class MoodUC1Test 
{
	@Test
	public void print_Welcome_Message() {
		MoodUC1 mood = new MoodUC1();
		mood.PrintWelcomeMessage();
	}
	private void PrintWelcomeMessage() {
		// TODO Auto-generated method stub
		
	}
	@Test 
	public void Given_Message_When_Sad_Should_Return_Sad() {
		MoodUC1 moodAnalyser= new MoodUC1();
		String mood = moodAnalyser.AnalyseMood("Sad Message");
		Assert.assertEquals("SAD", mood);
	}

	@Test 
	public void Given_Message_When_Happy_Should_Return_Happy() {
		MoodUC1 moodAnalyser= new MoodUC1();
		String mood = moodAnalyser.AnalyseMood("Happy Message");
		Assert.assertEquals("HAPPY", mood);
	}
}
