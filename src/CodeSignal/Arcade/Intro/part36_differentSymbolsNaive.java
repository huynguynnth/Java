package CodeSignal.Arcade.Intro;

public class part36_differentSymbolsNaive {

	int differentSymbolsNaive(String s) {
	    int count = 0;
	    for (char c = 'a'; c <= 'z'; c++) {
	        if (s.indexOf(c) > -1) {
	            count++;
	        }
	    }
	    return count;
	}

}
