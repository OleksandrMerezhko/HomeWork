package les1;

import java.util.Arrays;

public class L9_cycle3 {

	public static void main(String[] args) {
		int array [] = new int [101];
		array [0] = 100;
		for(int ind = 1; ind < 101; ind++) {
			array[ind] = array[ind-1] - 1;
		}
		String arrayprint = Arrays.toString(array);
		System.out.println(arrayprint);

	}

}
