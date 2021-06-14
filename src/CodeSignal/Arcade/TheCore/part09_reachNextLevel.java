package CodeSignal.Arcade.TheCore;

public class part09_reachNextLevel {

	boolean reachNextLevel(int experience, int threshold, int reward) {
	    return (experience + reward - threshold >= 0);
	}

}
