package CodeSignal.Arcade.Intro;

public class part47_isMAC48Address {
	
	boolean isMAC48Address(String inputString) {
	    return inputString.matches("([0-9A-F]{2}-){5}[0-9A-F]{2}");
	    // if (inputString.startsWith("-") | inputString.endsWith("-")) {
	    //     return false;
	    // }
	    
	    // String[] parts = inputString.split("-");
	    // if (parts.length != 6) {
	    //     return false;
	    // }
	    // System.out.println("Length: " + parts.length);
	    // for (int i = 0; i < parts.length; i++) {

	    //     System.out.println(parts[i]);
	    //     if (!parts[i].matches("[A-F0-9]{2}")) {
	    //         return false;
	    //     }
	    // }
	    // return true;
	}

}
