package mood;

public class MoodUC1 {
	
	public void PrintWelcomeMessage() {
		System.out.println("Welcome to the page");
	}
	
	public String AnalyseMood(String message) {
		if(message.contains("Sad"))
		return "SAD";
		return "HAPPY";
	}

}
