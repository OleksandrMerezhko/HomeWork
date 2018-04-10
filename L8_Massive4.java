package les1;

public class L8_Massive4 {

	public static void main(String[] args) {
		double[] a = {1200000000, 43, 3, 76, 87, 92, 81, 32, 2100000000, 66};
		double s = 0;
		
		for (int i = 0; i < a.length; i++) {
			s += a[i];
		}
		System.out.println(s/a.length);
	}
}
