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
	
	//hai cái if có thể combined vs nhau
	// return ((yourLeft == friendsLeft) && (yourRight == friendsRight)) ||
    //((yourLeft == friendsRight) && (yourRight == friendsLeft)) ;

}
