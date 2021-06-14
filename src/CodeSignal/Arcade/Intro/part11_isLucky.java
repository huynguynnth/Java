package CodeSignal.Arcade.Intro;

public class part11_isLucky {

	boolean isLucky(int n) {
	    String numString = Integer.toString(n);    
	    int len = numString.length();
	    
	    int sumFirstHalf = 0, sumSecondHalf = 0;
	    for (int i = 0; i < (len / 2); i++) {
	        sumFirstHalf += Integer.parseInt(String.valueOf(numString.charAt(i)));
	    } 

	    for (int i = (len / 2); i < len; i++) {
	        sumSecondHalf += Integer.parseInt(String.valueOf(numString.charAt(i)));
	    }

	    return (sumFirstHalf == sumSecondHalf);
	}

}
