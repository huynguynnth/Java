package CodeSignal.Arcade.Intro;

public class part49_lineEncoding {

	String lineEncoding(String s) {
	    String result = "";
	    int count = 1;
	    for (int i = 1; i < s.length(); i++) {
	        if (s.charAt(i) == s.charAt(i - 1)) {
	            count++;
	        } else {
	            if (count == 1) {
	                result = result + s.charAt(i - 1);
	            } else {
	                result = result + count + s.charAt(i - 1); 
	                count = 1;
	            }   
	        }
	    }
	    if (count == 1) {
	        result = result + s.charAt(s.length() - 1);
	    } else {
	        result = result + count + s.charAt(s.length() - 1); 
	        count = 1;
	    }   
	    return result;
	}
}
