package CodeSignal.Arcade.Intro;

public class part19_areEquallyStrong {

	boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
	    if ((yourLeft == friendsLeft) & (yourRight == friendsRight)) {
	        return true;
	    }
	    if ((yourLeft == friendsRight) & (yourRight == friendsLeft)) {
	        return true;
	    }
	    return false;
	}

}
