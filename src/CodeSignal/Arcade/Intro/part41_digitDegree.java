package CodeSignal.Arcade.Intro;

public class part41_digitDegree {

	int digitDegree(int n) {
	    int count = 0;
	    while (n > 9) {
	        count++;
	        n = sumDigits(n);
	    }
	    return count;
	}

	int sumDigits(int n) {
	    int sum = 0;
	    while (n != 0) {
	        sum += n % 10;
	        n /= 10;
	    }
	    return sum;
	}

}
