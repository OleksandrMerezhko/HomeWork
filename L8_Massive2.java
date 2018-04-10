package les1;
import java.util.Arrays;
import java.util.Scanner;

public class L8_Massive2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[] = new int[10];
		a[0] = s.nextInt();
		a[1] = s.nextInt();
		a[2] = s.nextInt();
		a[3] = s.nextInt();
		a[4] = s.nextInt();
		a[5] = s.nextInt();
		a[6] = s.nextInt();
		a[7] = s.nextInt();
		a[8] = s.nextInt();
		a[9] = s.nextInt();
		Arrays.sort(a);
		String b = Arrays.toString(a);
		System.out.println(b);
		s.close();
	}
}
