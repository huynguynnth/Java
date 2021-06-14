package CodeSignal.Arcade.Intro;

public class part21_isIPv4Address {

	boolean isIPv4Address(String inputString) {
	    String[] parts = inputString.split("[.]");
	    if (parts.length != 4) {
	        return false;
	    }
	    for (String part : parts) {
	        if ((part.length() >= 2) & part.startsWith("0")) {
	            return false;
	        }
	        
	        try {
	            int number = Integer.parseInt(part);
	            if (number > 255 || number < 0) {
	            return false;
	            }
	        } catch (Exception e) {
	            return false;
	        }

	    }
	    return true;
	}

}
