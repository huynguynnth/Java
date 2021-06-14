package CodeSignal.Arcade.Intro;

public class part17_arrayChange {

	int arrayChange(int[] a) {
	    int count = 0;
	    for (int i = 0; i < a.length - 1; i++) {
	        if (a[i] >= a[i + 1]) {
	            count += a[i] + 1 - a[i + 1];
	            a[i + 1] = a[i] + 1;
	        }
	    }
	    return count;    
	}

}
