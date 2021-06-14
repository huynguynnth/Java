package CodeSignal.Arcade.Intro;

public class part10_commonCharacterCount {

	int commonCharacterCount(String s1, String s2) {
	    int countAll = 0;
	    for (char i = 'a'; i <= 'z'; i++) {
	        int countCharFirst = 0, countCharSecond = 0;
	        for (int a = 0; a < s1.length(); a++) {
	            System.out.println(s1.charAt(a));
	            if (s1.charAt(a) == i) {
	                countCharFirst++;
	            }
	        }
	        for (int b = 0; b < s2.length(); b++) {
	            if (s2.charAt(b) == i) {
	                countCharSecond++;
	            }
	        }
	        
	        if (countCharFirst < countCharSecond) {
	            countAll += countCharFirst;
	        } else {
	            countAll += countCharSecond;
	        }
	    }
	    return countAll;
	}

}
