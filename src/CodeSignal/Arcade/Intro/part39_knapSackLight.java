package CodeSignal.Arcade.Intro;

public class part39_knapSackLight {

	int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
	    if (maxW >= weight1) {
	        if (maxW - weight1 >= weight2) {
	            return value1 + value2;
	        } 
	        else if (maxW >= weight2) {
	            return (value1 > value2) ? value1 : value2;
	        } else {
	            return value1;
	        }
	    }
	    else if (maxW >= weight2) {
	        return value2;
	    }
	    return 0;
	}

}
