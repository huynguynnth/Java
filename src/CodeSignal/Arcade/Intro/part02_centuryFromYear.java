package CodeSignal.Arcade.Intro;

public class part02_centuryFromYear {
	
	int centuryFromYear(int year) {
	    int tmpCentury = year / 100;
	    if (year > tmpCentury * 100) {
	        tmpCentury++;
	    }
	    return tmpCentury;
	}
	
}
