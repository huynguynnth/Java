package CodeSignal.Arcade.Intro;

public class part32_absoluteValuesSumMinimization {

	int absoluteValuesSumMinimization(int[] a) {
	    int min = 0, indexOfMin = 0;
	    for (int i = 0; i < a.length; i++) {
	        int sum = sumOfDiff(a, i);
	        if (min == 0) {
	            min = sum;
	        } else if (sum < min) {
	            min = sum;
	            indexOfMin = i;
	        }
	    }
	    return a[indexOfMin];
	}

	int sumOfDiff(int[] array, int index) {
	    int sum = 0;
	    for (int i = 0; i < array.length; i++) {
	        sum += Math.abs(array[i] - array[index]);
	    }
	    return sum;
	}

}
