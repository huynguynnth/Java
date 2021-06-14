package CodeSignal.Arcade.Intro;

public class part14_alternatingSums {

	int[] alternatingSums(int[] a) {
	    int[] sum = new int[2];
	    
	    for (int i = 0; i < a.length; i += 2) {
	        sum[0] += a[i];
	    }
	    
	    for (int i = 1; i < a.length; i += 2) {
	        sum[1] += a[i];
	    }
	    return sum;
	}

}
