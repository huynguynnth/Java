package CodeSignal.Arcade.Intro;

public class part28_alphabeticShift {

	String alphabeticShift(String inputString) {
	    String tmpString = inputString, result = "";
	    for (int i = 0; i < tmpString.length(); i++) {
	        int c = tmpString.charAt(i);
	        c = c + 1;
	        if (c > 'z') {
	            c -= 26;
	        }
	        result = result + (char) c;
	    }
	    return result;
	}

}
