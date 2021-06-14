package CodeSignal.Arcade.Intro;

public class part09_allLongestStrings {

	String[] allLongestStrings(String[] inputArray) {
	    int maxLength = -1;
	    for (String s : inputArray) {
	        if (s.length() > maxLength) {
	            maxLength = s.length();
	        }
	    }
	    System.out.println("Max length = " + maxLength);
	    
	    List<String> list = new ArrayList<>();
	    for (String s : inputArray) {
	        if (s.length() == maxLength) {
	            list.add(s);
	        }
	    }
	    
	    String[] result = new String[list.size()];
	    result = list.toArray(result);
	    
	    return result;
	}

}
