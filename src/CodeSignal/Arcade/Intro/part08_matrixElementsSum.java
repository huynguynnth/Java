package CodeSignal.Arcade.Intro;

public class part08_matrixElementsSum {

	int matrixElementsSum(int[][] matrix) {
	    int sum = 0;
	    // i = col, j = row
	    for (int i = 0; i < matrix[0].length; i++) {
	        for (int j = 0; j < matrix.length; j++) {
	            if (matrix[j][i] != 0) {
	                System.out.println(matrix[j][i]);
	                sum += matrix[j][i];
	            } /*else {
	                break;
	            } cái else này viết thêm cũng chả để làm gì?*/
	        }
	    }
	    return sum;
	}

}
