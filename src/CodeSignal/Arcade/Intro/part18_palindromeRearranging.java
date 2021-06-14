package CodeSignal.Arcade.Intro;

public class part18_palindromeRearranging {

	boolean palindromeRearranging(String inputString) {
	    int count = 0;
	    for (char i = 'a'; i <= 'z'; i++) {
	        System.out.println("Occurrences of " + i + ": " + countCharacter(inputString, i));
	        if(countCharacter(inputString, i) % 2 == 1) {
	            count++;
	            if (count > 1) {
	                System.out.println("Character lead to FALSE: "+ i);
	                return false;
	            }
	        } 
	    }
	    return true;
	}

	int countCharacter(String s, char c) {
	    int count = 0;
	    for (int i = 0; i < s.length(); i++) {
	        if (s.charAt(i) == c) {
	            count++;
	        }
	    }
	    return count;
	}

}
