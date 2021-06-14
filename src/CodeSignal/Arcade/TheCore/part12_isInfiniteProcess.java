package CodeSignal.Arcade.TheCore;

public class part12_isInfiniteProcess {

	boolean isInfiniteProcess(int a, int b) {
	    if (a > b) {
	        return true;
	    }
	    return ((b - a) % 2 != 0);
	}

}
