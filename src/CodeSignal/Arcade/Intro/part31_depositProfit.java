package CodeSignal.Arcade.Intro;

public class part31_depositProfit {

	int depositProfit(int deposit, int rate, int threshold) {
	    double balance = deposit;
	    int year = 0;
	    while (balance < threshold) {
	        year++;
	        balance *= (1 + rate / (double) 100);
	    }
	    return year;
	}

}
