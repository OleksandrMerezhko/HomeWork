package les1;

public class L8_Massive4 {

	public static void main(String[] args) {
		double[] mas = {1200000000, 43, 3, 76, 87, 92, 81, 32, 2100000000, 66};
		double sum = 0;
		
		for (int ind = 0; ind < mas.length; ind++) {
			sum += mas[ind];
		}
		System.out.println(sum/mas.length);
	}
}
