package CodeSignal.Arcade.Intro;

public class part24_Minesweeper {

	int[][] minesweeper(boolean[][] matrix) {
	    int row = matrix.length;
	    int col = matrix[0].length;
	    int[][] mine = new int[row][col];
	    for (int i = 0; i < row; i++) {
	        for (int j = 0; j < col; j++) {
	            if (matrix[i][j] == true) {
	                mine[i][j] = -1;
	            } 
	            int startRow = (i - 1 >= 0) ? (i - 1) : i;
	            int endRow = (i + 1 < row) ? (i + 1) : i;
	            int startCol = (j - 1 >= 0) ? (j - 1) : j;
	            int endCol = (j + 1 < col) ? (j + 1) : j;
	                for (int a = startRow; a <= endRow; a++) {
	                for (int b = startCol; b <= endCol; b++) {
	                    if (matrix[a][b] == true) {
	                        mine[i][j] += 1;
	                    }
	                }
	            }
	        }
	    }
	    return mine;
	}

}
