package CodeSignal.Arcade.Intro;

public class part38_growingPlant {

	int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
	    int day, height;
	    day = height = 0;
	    while (true) {
	        day++;
	        height += upSpeed;
	        if (height >= desiredHeight) {
	            break;
	        }
	        height -= downSpeed;
	    }
	    return day;
	}

}
