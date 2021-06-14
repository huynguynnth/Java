package CodeSignal.Arcade.Intro;

public class part56_digitsProduct {

	int digitsProduct(int product) {
	    if (product == 0) {
	        return 10;
	    }
	    if (product <= 9) {
	        return product;
	    }
	    String numberString = "";
	    while (true) {
	        if (product == 1) {
	            break;
	        }
	        
	        int index = -1;
	        for (int i = 9; i >= 2; i--) {
	            if (product % i == 0) {
	                numberString =  i + numberString;
	                index = i;
	                break;
	            }
	        }
	        if (index == -1) {
	            return -1;
	        } 
	        product /= index;
	    }
	    return Integer.parseInt(String.valueOf(numberString));
	}

}
