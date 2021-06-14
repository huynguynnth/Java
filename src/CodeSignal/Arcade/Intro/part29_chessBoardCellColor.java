package CodeSignal.Arcade.Intro;

public class part29_chessBoardCellColor {

	boolean chessBoardCellColor(String cell1, String cell2) {
	    int sumOfValue1, sumOfValue2;
	    sumOfValue1 = sumOfValue2 = 0;
	    int n1 = Character.getNumericValue(cell1.charAt(1));
	    int n2 = Character.getNumericValue(cell2.charAt(1));
	    
	    System.out.println(n1 + " " + n2);
	    sumOfValue1 = valueOfColumn(cell1.charAt(0)) + n1;
	    sumOfValue2 = valueOfColumn(cell2.charAt(0)) + n2;
	    System.out.println(sumOfValue1 + " " + sumOfValue2);
	    return ((sumOfValue1 - sumOfValue2) % 2 == 0);
	}

	int valueOfColumn(char c) {
	    if ((c == 'A') | (c == 'C') | (c == 'E') | (c == 'G')) {
	        return 1;
	    }
	    return 0;
	}
	
}
