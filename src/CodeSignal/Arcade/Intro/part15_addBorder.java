package CodeSignal.Arcade.Intro;

public class part15_addBorder {

	String[] addBorder(String[] picture) {
	    String[] pictureWithBorder = new String[picture.length + 2];
	    pictureWithBorder[0] = pictureWithBorder[pictureWithBorder.length - 1] 
	    = addAsterisks(picture[0].length() + 2);
	    for (int i = 0; i < picture.length; i++) {
	        pictureWithBorder[i + 1] = "*" + picture[i] + "*";
	    }
	    
	    return pictureWithBorder;
	}

	String addAsterisks(int number) {
	    String s = "";
	    for (int i = 0; i < number; i++) {
	        s += "*";
	    }
	    return s;
	}
}
