package CodeSignal.Arcade.Intro;

public class part44_findEmailDomain {

	String findEmailDomain(String address) {
		
	    // String result = "";
	    // for (int i = address.lastIndexOf('@') + 1; i < address.length(); i++) {
	    //     result += address.charAt(i);
	    // }
	    // return result;
	    return address.substring(address.lastIndexOf('@') + 1);
	}

}
