package CodeSignal.Arcade.TheCore;

public class part02_largestNumber {

	int largestNumber(int n) {
	    String s = "";
	    for (int i = 0; i < n; i++) {
	        s = s + "9";
	    }
	    return Integer.parseInt(String.valueOf(s));
	}

}
