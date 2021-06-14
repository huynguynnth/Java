package CodeSignal.Arcade.Intro;

public class part58_messageFromBinaryCode {

	String messageFromBinaryCode(String code) {
	    String result = "";
	    for (int i = 0; i < code.length() - 7; i+=8) {
	        int decimal = Integer.parseInt(code.substring(i, i + 8), 2);
	        char c = (char) decimal;
	        result = result + c;
	    }
	    return result;
	}

}
