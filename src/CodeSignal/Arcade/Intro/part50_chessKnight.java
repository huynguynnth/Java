package CodeSignal.Arcade.Intro;

public class part50_chessKnight {

	int chessKnight(String cell) {
	    int count = 0;
	    if (cell.charAt(0) + 2 <= 'h') {
	        if (cell.charAt(1) + 1 <= '8') {
	            count++;
	        } 
	        if (cell.charAt(1) - 1 > '0') {
	            count++;
	        }
	    }
	    if (cell.charAt(0) + 1 <= 'h') {
	        if (cell.charAt(1) + 2 <= '8') {
	            count++;
	            } 
	        if (cell.charAt(1) - 2 > '0') {
	            count++;
	        }
	    }
	    
	    if (cell.charAt(0) - 2 >= 'a') {
	        if (cell.charAt(1) + 1 <= '8') {
	            count++;
	        } 
	        if (cell.charAt(1) - 1 > '0') {
	            count++;
	        }
	    }
	    if (cell.charAt(0) - 1 >= 'a') {
	        if (cell.charAt(1) + 2 <= '8') {
	            count++;
	            } 
	        if (cell.charAt(1) - 2 > '0') {
	            count++;
	        }
	    }
	    return count;
	}

}
