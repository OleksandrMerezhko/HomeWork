package les1;

import java.util.Arrays;

public class L8_Massive3 {

	public static void main(String[] args) {
		int a[] = {23, 54, 76, 43, 91};
		int b = a[0];
		a[0] = a[a.length-1];
		a[a.length-1] = b;
		System.out.println(Arrays.toString(a));
	}

}
