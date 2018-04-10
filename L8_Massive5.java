package les1;
import java.util.Arrays;
import java.util.Scanner;

public class L8_Massive5 {

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
		s.close();
		int b[] = new int [5];
		int c[] = new int [5];
		System.arraycopy(a, 0, b, 0, 5);
		System.arraycopy(a, 5, c, 0, 5);
		Arrays.sort(b);
		Arrays.sort(c);
		String mb = Arrays.toString(b);
		String mc = Arrays.toString(c);
		System.out.println(mb);
		System.out.println(mc);
	}
}
