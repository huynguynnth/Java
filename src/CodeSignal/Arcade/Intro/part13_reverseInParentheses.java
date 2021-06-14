package CodeSignal.Arcade.Intro;

public class part13_reverseInParentheses {
	
	String reverseInParentheses(String inputString) {
	    String tmp = inputString;
	    while (true) {
	        String head, middle, tail;
	        head = middle = tail = "";
	        int a = tmp.lastIndexOf('(');
	        int b = tmp.indexOf(')', a + 1);
	        System.out.println("a: " + a);
	        System.out.println("b: " + b);
	        if (a >= 0) {
	            for (int i = 0; i < a; i++) {
	                head += tmp.charAt(i);
	            }
	            System.out.println(head);
	            if (b + 1 <= tmp.length() - 1) {
	                for (int i = b + 1; i < tmp.length(); i++) {
	                    tail += tmp.charAt(i);
	                }               
	            }

	            for (int i = b - 1; i > a; i--) {
	                middle += tmp.charAt(i);
	            }
	            tmp = head + middle + tail;
	        } else {
	            break;
	        }
	    }
	    return tmp;
	}
}
