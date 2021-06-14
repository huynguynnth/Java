package CodeSignal.Arcade.Intro;

public class part42_bishopAndDawn {

	boolean bishopAndPawn(String bishop, String pawn) {
	    return Math.abs(bishop.charAt(0) - pawn.charAt(0))
	        == Math.abs(bishop.charAt(1) - pawn.charAt(1));
	}

}
