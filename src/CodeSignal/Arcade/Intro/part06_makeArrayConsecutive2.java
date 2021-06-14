package CodeSignal.Arcade.Intro;

public class part06_makeArrayConsecutive2 {

	int makeArrayConsecutive2(int[] statues) {
	    Arrays.sort(statues);
	    return (statues[statues.length - 1] - statues[0] + 1 - statues.length);
	    
	    // int count = 0;
	    // int[] tmpStatues;
	    // int n = statues.length;
	    // int max = statues[0];
	    // int min = statues[0];
	    
	    // for (int i = 1; i < n; i++) {
	    //     if (statues[i] > max) {
	    //         max = statues[i];
	    //     }
	    //     if (statues[i] < min) {
	    //         min = statues[i];
	    //     }
	    // }
	    
	    // for (int i = min + 1; i < max; i++) {
	    //     boolean flag = false;
	    //     for (int j = 0; j < n; j++) {
	    //         if (i == statues[j]) {
	    //             flag = true;
	    //         }
	    //     }
	    //     if (!flag) {
	    //         count++;
	    //     }
	    // }
	    // return count;
	}
	
}
