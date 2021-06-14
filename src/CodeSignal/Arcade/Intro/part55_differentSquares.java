package CodeSignal.Arcade.Intro;

public class part55_differentSquares {

	int differentSquares(int[][] matrix) {
	    List<String> arrayString = new ArrayList<String>();
	    for (int i = 0; i < matrix.length - 1; i++) {
	        for (int j = 0; j < matrix[0].length - 1; j++) {
	            String tmp = "" + matrix[i][j] + matrix[i+1][j] + matrix[i][j+1] + matrix[i+1][j+1];
	            if (!arrayString.contains(tmp)) {
	                arrayString.add(tmp);
	            }
	        } 
	    }
	    return arrayString.size();
	}

}
