package mood;

public class MoodUC3 {

		public void PrintWelcomeMessage() {
			System.out.println("Welcome to the page");
		}

		public String AnalyseMood(String message) throws Exception {
			try {
				if(message.length() == 0)
					throw new Exception(Exception.ExceptionType.ENTERED_EMPTY,"Please Enter Proper Non-Empty Mood");
				if(message.contains("Sad"))
					return "SAD";
				else
					return "HAPPY";
			} catch(NullPointerException e) {
				throw new Exception(Exception.ExceptionType.ENTERED_NULL,"Please Enter the Proper Mood");
			} catch(IllegalArgumentException e) {
				throw new Exception(Exception.ExceptionType.ENTERED_NULL,"Please Enter the Proper Mood");
			}
		}

	}