package CodeSignal.Arcade.Intro;

public class part34_extractEachKth {

	int[] extractEachKth(int[] inputArray, int k) {
	    if (k > (inputArray.length - 1)) {
	        return inputArray;
	    }
	    
	    ArrayList<Integer> tmp = new ArrayList<Integer>();
	    
	    for (int i = 0; i < inputArray.length; i++) {
	        if ((i + 1) % k != 0) {
	            tmp.add(inputArray[i]);
	        }
	    }
	    
	    int[] result = new int[tmp.size()];
	    for (int i = 0; i < result.length; i++) {
	        result[i] = tmp.get(i).intValue();
	    }
	    return result;
	}

}
