package les1;

public class L9_cycle1 {

	public static void main(String[] args) {
		int num = 10;
		while(num <= 20) {
			System.out.println(num);
			num++;
		}
		for(num = 10; num <= 20; num++) {
			System.out.println(num);
		}
		num = 10;
		do {
			System.out.println(num);
			num++;
			}
		while(num <= 20);
		int[] array = new int[] {10,11,12,13,14,15,16,17,18,19,20};
		for(int elem:array) {
		System.out.println(elem);
		}	
		
	}

}
