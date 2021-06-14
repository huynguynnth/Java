package CodeSignal.Arcade.Intro;

public class part46_electionWinners {

	int electionsWinners(int[] votes, int k) {
	    int count = 0;
	    int[] tmp = Arrays.copyOf(votes, votes.length);
	    for (int i = 0; i < votes.length; i++) {
	        int oldValue = tmp[i];
	        tmp[i] = -1;
	        if ((votes[i] + k) > maxElement(tmp)) {    
	            count++;
	        }
	        tmp[i] = oldValue;
	    }
	    return count;
	}

	int maxElement(int[] array) {
	    int max = array[0];
	    for (int i = 1; i < array.length; i++) {
	        if (array[i] > max) {
	            max = array[i];
	        }
	    }
	    return max;
	}
	
}
