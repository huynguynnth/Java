package CodeSignal.Arcade.Intro;

public class part37_arrayMaxConsecutiveSum {

	int arrayMaxConsecutiveSum(int[] inputArray, int k) {
	    int n = inputArray.length;
	    int maxSum = 0;
	    for (int i = 0; i < n - k + 1; i++) {
	        int tmpSum = 0;
	        for (int j = i; j < i + k; j++) {
	            tmpSum += inputArray[j];
	        }
	        
	        if (maxSum == 0) {
	            maxSum = tmpSum;
	        } else if (tmpSum > maxSum) {
	            maxSum = tmpSum;
	        }
	    }
	    return maxSum;
	}

}
