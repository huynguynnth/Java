package CodeSignal.Arcade.Intro;

public class part53_validTime {
	
	boolean validTime(String time) {
	    // return (time.matches("[0-1][0-9]:[0-5][0-9]") |
	    //     time.matches("2[0-3]:[0-5][0-9]"));
	    return time.matches("([01]\\d|2[0-3]):[0-5]\\d");
	}

}
