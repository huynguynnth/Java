package CodeSignal.Arcade.Intro;

public class part07_almostIncreasingSequence {

	boolean almostIncreasingSequence(int[] sequence) {
	    int n = sequence.length;
	    if (n == 2) {
	        return true;
	    }
	    
	    for (int i = 0; i < n; i++) {
	        // delete first element
	        if (i == 0) {
	            if(strictlyIncreasing(sequence, 1, n - 1)) {
	                return true;
	            }
	            continue;
	        }
	        
	        // delete last element
	        if (i == n - 1) {
	            if(strictlyIncreasing(sequence, 0, n - 2)) {
	                return true;
	            }
	            return false;
	        }
	        
	        // delete element in the middle
	        if (sequence[i - 1] < sequence[i + 1]) {
	            if ((strictlyIncreasing(sequence, 0, i - 1)) & (strictlyIncreasing(sequence, i + 1, n - 1))) {
	                System.out.println("4 " + i);
	                return true;
	            }
	        }
	    }
	    return false;
	}
	
	boolean strictlyIncreasing(int[] array, int a, int b) {
	
	    for (int j = a; j < b; j++) {
	        if (array[j] >= array[j + 1]) {
	            return false;
	        }
	    }
	    return true;
	}
	
}
