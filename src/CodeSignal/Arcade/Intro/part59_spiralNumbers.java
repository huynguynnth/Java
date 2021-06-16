package CodeSignal.Arcade.Intro;

public class part59_spiralNumbers {

	int[][] spiralNumbers(int n) {
	    int[][] a = new int[n][n];
	    int k = 1, index = 0;
	    while (true) {
	        if (k > (n * n)) {
	            break;
	        }

	        for (int i = index; i < n - 1 - index; i++) {
	            a[index][i] = k++;
	        }
	        for (int i = index; i < n - 1 - index; i++) {
	            a[i][n-1-index] = k++; 
	        }
	        for (int i = n - 1 - index; i > index; i--) {
	            a[n-1-index][i] = k++;
	        }
	        for (int i = n - 1 - index; i > index; i--) {
	            a[i][index] = k++;
	        }
	        index++;
	        if (index == n - 1 - index) {
	            a[index][index] = k++;
	            break;
	        }
	    }
	    return a;
	    
	    //ủa rồi sao cần những 4 cái loop trong khi có thể làm 2 loops?
	}

}
