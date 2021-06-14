package CodeSignal.Arcade.Intro;

public class part54_sumUpNumbers {

	int sumUpNumbers(String inputString) {
	    int sum = 0;
	    String[] parts = inputString.split("\\D+");
	    for (String part : parts) {
	        if (!part.isEmpty()) {
	            sum += Integer.parseInt(part);
	        }
	    }
	    return sum;
	}

}
