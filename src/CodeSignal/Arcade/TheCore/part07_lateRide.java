package CodeSignal.Arcade.TheCore;

public class part07_lateRide {

	int lateRide(int n) {
	    int result = 0;
	    int hour = n / 60;
	    result += hour / 10 + hour % 10;
	    int minute = n % 60;
	    result += minute / 10 + minute % 10;
	    return result;
	}

}
