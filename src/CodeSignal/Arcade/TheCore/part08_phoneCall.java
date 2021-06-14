package CodeSignal.Arcade.TheCore;

public class part08_phoneCall {

	int phoneCall(int min1, int min2_10, int min11, int s) {
	    int minute = 0;
	    if (s < min1) {
	        return 0;
	    } else {
	        minute++;
	        s -= min1;
	    }
	    
	    if (s < (9 * min2_10)) {
	        minute += s / min2_10;
	        return minute;
	    } else {
	        minute += 9;
	        s -= (9 * min2_10);
	    }
	    
	    minute += s / min11;
	    return minute;
	}

}
