package mood;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class MoodUC3Test 
{
	@Test
	public void print_Welcome_Message() {
		MoodUC3 mood = new MoodUC3();
		mood.PrintWelcomeMessage();
	}
	@Test 
	public void Given_Message_When_Sad_Should_Return_Sad() {
		MoodUC3 moodAnalyser= new MoodUC3();
		String mood = null;
		try {
			mood = moodAnalyser.AnalyseMood("This is a Sad Message");
			Assert.assertEquals("SAD", mood);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test 
	public void Given_Message_When_Happy_Should_Return_Happy() {
		MoodUC3 moodAnalyser= new MoodUC3();
		String mood = null;
		try {
			mood = moodAnalyser.AnalyseMood("This is a Happy Message");
			Assert.assertEquals("HAPPY", mood);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	

	}





