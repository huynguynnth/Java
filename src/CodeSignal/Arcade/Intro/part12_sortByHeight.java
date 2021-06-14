package CodeSignal.Arcade.Intro;

public class part12_sortByHeight {
	int[] sortByHeight(int[] a) {
	    for (int i = 0; i < a.length - 1; i++) {
	        for (int j = 0; j < a.length - 1; j++) {
	            if (a[j] == -1) {
	                continue;
	            }
	            for (int k = j + 1; k < a.length; k++) {
	                if (a[k] == -1) {
	                    continue;
	                } else {
	                    if (a[j] > a[k]) {
	                        int tmp = a[j];
	                        a[j] = a[k];
	                        a[k] = tmp;
	                        }
	                    break;
	                }
	            }
	        }
	    }
	    return a;
	}

}
