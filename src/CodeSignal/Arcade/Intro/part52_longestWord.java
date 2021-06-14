package CodeSignal.Arcade.Intro;

public class part52_longestWord {

	String longestWord(String text) {
	    String[] parts = text.split("[^a-zA-Z]");
	    String longest = parts[0];
	    for (int i = 1; i < parts.length; i++) {
	        System.out.println(parts[i]);
	        if (parts[i].length() > longest.length()) {
	            longest = parts[i];
	        }
	    }
	    return longest;
	}

}
