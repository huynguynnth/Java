package CodeSignal.Arcade.Intro;

public class part22_avoidObstacles {
	int avoidObstacles(int[] inputArray) {
	    int max = maxElement(inputArray);
	    for (int i = 2; i < max + 1; i++) {
	        for (int j = 0; j < inputArray.length; j++) {
	            if ((inputArray[j] % i) == 0) {
	                break;
	            }
	            if (j == inputArray.length - 1) {
	                return i;
	            }
	        }
	    }
	    return (max + 1);
	}

	int maxElement(int[] array) {
	    int max = array[0];
	    for (int i = 1; i < array.length; i++) {
	        if (array[i] > max) {
	            max = array[i];
	        }
	    }
	    return max;
	}

}
