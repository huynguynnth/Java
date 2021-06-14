package CodeSignal.Arcade.Intro;

public class part26_evenDigitsOnly {

	boolean evenDigitsOnly(int n) {
	    while (true) {
	        if (n < 10) {
	            if (n % 2 == 1) {
	                return false;
	            }
	            return true;
	        }
	        
	        int lastDigit = n % 10;
	        if (lastDigit % 2 == 1) {
	            return false;
	        }
	        n /= 10;
	    }
	}

}
