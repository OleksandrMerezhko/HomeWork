package les1;

import java.util.Arrays;
import java.util.Random;

public class L9_cycle4 {

	public static void main(String[] args) {
			int array [] = new int [10];
			Random el = new Random();
			for(int ind = 0; ind < 10; ind++) {
				array[ind] = el.nextInt();
			}
			long sum = 0;
			for(int ind = 1; ind < 9; ind++) {
			sum+= array[ind];
			}
			String arrayprint = Arrays.toString(array);
			System.out.println(arrayprint);
			System.out.println(sum);

	}

}
