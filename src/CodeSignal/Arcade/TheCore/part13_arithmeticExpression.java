package CodeSignal.Arcade.TheCore;

public class part13_arithmeticExpression {

	boolean arithmeticExpression(int a, int b, int c) {
	    return ((a + b == c) | (a - b == c) | (a * b == c) | (b * c == a)) ;
	}

}
