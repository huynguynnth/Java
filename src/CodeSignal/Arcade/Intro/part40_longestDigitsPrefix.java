package CodeSignal.Arcade.Intro;

public class part40_longestDigitsPrefix {

	String longestDigitsPrefix(String inputString) {
	    String result = "";
	    for (int i = 0; i < inputString.length(); i++) {
	        char c = inputString.charAt(i);
	        if (!((c >= '0') & (c <= '9'))) {
	            break;
	        }
	        result += c;
	    }
	    return result;
	}

}
