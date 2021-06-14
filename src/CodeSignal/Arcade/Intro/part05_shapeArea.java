package CodeSignal.Arcade.Intro;

public class part05_shapeArea {

	int shapeArea(int n) {
	    if (n == 1) {
	        return 1;
	    }
	    return (shapeArea(n-1) + 4 * (n - 1));
	}
	
}
