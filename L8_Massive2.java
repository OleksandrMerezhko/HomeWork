package les1;
import java.util.Arrays;
import java.util.Scanner;

public class L8_Massive2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mas[] = new int[10];
		mas[0] = input.nextInt();
		mas[1] = input.nextInt();
		mas[2] = input.nextInt();
		mas[3] = input.nextInt();
		mas[4] = input.nextInt();
		mas[5] = input.nextInt();
		mas[6] = input.nextInt();
		mas[7] = input.nextInt();
		mas[8] = input.nextInt();
		mas[9] = input.nextInt();
		Arrays.sort(mas);
		String masprint = Arrays.toString(mas);
		System.out.println(masprint);
		input.close();
	}
}
