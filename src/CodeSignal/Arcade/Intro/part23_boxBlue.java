package CodeSignal.Arcade.Intro;

public class part23_boxBlue {

	int[][] boxBlur(int[][] image) {
	    int row = image.length - 2;
	    int col = image[0].length - 2;
	    int[][] result = new int[row][col];
	    for (int i = 0; i < row; i++) {
	        for (int j = 0; j < col; j++) {
	            for (int a = i; a <= i + 2; a++) {
	                for (int b = j; b <= j + 2; b++) {
	                    result[i][j] += image[a][b];
	                }
	            }
	            result[i][j] /= 9;
	        }
	    }
	    return result;
	}

}
