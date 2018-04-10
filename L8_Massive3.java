package les1;

import java.util.Arrays;

public class L8_Massive3 {

	public static void main(String[] args) {
		int mas[] = {23, 54, 76, 43, 91};
		int per = mas[0];
		mas[0] = mas[mas.length-1];
		mas[mas.length-1] = per;
		String masprint = Arrays.toString(mas);
		System.out.println(masprint);
	}
}
