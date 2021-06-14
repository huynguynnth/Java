package CodeSignal.Arcade.Intro;

public class part45_buildPalindrome {

	String buildPalindrome(String st) {
	    int n = st.length();
	    if(isPalindrome(st)) {
	        return st;
	    }
	    
	    for (int i = 0; i < n; i++) {
	        String tmpString = st + reversedString(st.substring(0, i + 1));
	        if (isPalindrome(tmpString)) {
	            return tmpString;
	        }
	    }
	    return "";
	}

	boolean isPalindrome(String s) {
	    int n = s.length();
	    for (int i = 0; i < n; i++) {
	        if (s.charAt(i) != s.charAt(n - 1 - i)) {
	            return false;
	        }
	    }
	    return true;
	}

	String reversedString(String s) {
	    String result = "";
	    for (int i = s.length() - 1; i >= 0; i--) {
	        result += s.charAt(i);
	    }
	    return result;
	}

}
