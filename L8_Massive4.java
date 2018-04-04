package les1;

public class L8_Massive4 {

	public static void main(String[] args) {
		int[] a = {12, 43, 3, 76, 87, 92, 81, 32, 22, 66};
		int s = 0;
		
		for (int i = 0; i < a.length; i++) {
			s += a[i];
		}
		System.out.println((double)s/a.length);

	}

}
