package mood;

public class MoodUC2 {

	public void PrintWelcomeMessage() {
		System.out.println("Welcome to the page");
	}

	public String AnalyseMood(String message) {
		try{
			if(message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch(Exception e) {
			return "HAPPY";
		}
	}

}
