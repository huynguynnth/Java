package CodeSignal.Arcade.Intro;

public class part43_isBeautifulString {

	boolean isBeautifulString(String inputString) {
	    int[] occurrences = new int[26];
	    for (char c = 'a'; c <= 'z'; c++) {
	        occurrences[c - 97] = countChar(inputString, c);
	        if (c - 97 > 0) {
	            if (occurrences[c - 97] > occurrences[c - 98]) {
	                return false;
	            }
	        }
	    }
	    return true;
	}

	int countChar(String s, char c) {
	    int count = 0;
	    for (int i = 0; i < s.length(); i++) {
	        if (s.charAt(i) == c) {
	            count++;
	        }
	    }
	    return count;
	}

}
