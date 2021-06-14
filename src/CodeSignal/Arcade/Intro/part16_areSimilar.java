package CodeSignal.Arcade.Intro;

public class part16_areSimilar {
	boolean areSimilar(int[] a, int[] b) {
	    int count = 0;
	    int[] indexToSwap = new int[2];
	    int k = 0;
	    for (int i = 0; i < a.length; i++) {
	        if (a[i] != b[i]) {
	            count++;
	            if (count > 2) {
	                return false;
	            } else {
	                indexToSwap[k++] = i;
	            }
	        }
	    }

	    if ((a[indexToSwap[0]] == b[indexToSwap[1]]) &
	        (a[indexToSwap[1]] == b[indexToSwap[0]])) {
	            return true;
	    }
	    return false;
	}

}
