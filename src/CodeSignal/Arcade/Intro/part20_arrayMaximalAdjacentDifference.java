package CodeSignal.Arcade.Intro;

public class part20_arrayMaximalAdjacentDifference {

	int arrayMaximalAdjacentDifference(int[] inputArray) {
	    int maxDifference = -1;
	    for (int i = 0; i < inputArray.length - 1; i++) {
	        int tmpDifference = inputArray[i] - inputArray[i + 1];
	        if (tmpDifference < 0) {
	            tmpDifference *= - 1;
	        }
	        if (tmpDifference > maxDifference) {
	            maxDifference = tmpDifference;
	        }
	    }
	    return maxDifference;
	}

}
