package CodeSignal.Arcade.Intro;

public class part03_checkPalindrome {

	boolean checkPalindrome(String inputString) {
	    for (int i = 0, n = inputString.length(); i < n; i++) {
	        if (inputString.charAt(i) != inputString.charAt(n - i - 1)) {
	            return false;
	        }
	    }
	    return true;
	}
	
}
