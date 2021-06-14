package CodeSignal.Arcade.Intro;

public class part04_adjacentElementsProduct {
	int adjacentElementsProduct(int[] inputArray) {
		
	    int maxProduct = inputArray[0] * inputArray[1];
	    for (int i = 1; i < inputArray.length - 1; i++) {
	        int tmpProduct = inputArray[i] * inputArray[i + 1];
	        if (tmpProduct > maxProduct) {
	            maxProduct = tmpProduct;
	        }
	    }
	    return maxProduct;
	}
	
}
