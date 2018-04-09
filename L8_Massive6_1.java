package les1;
import java.util.Scanner;
import java.util.Arrays;

public class L8_Massive6_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите размер массива:");
		int size = sc.nextInt();
		int mas[] = new int [size];
		System.out.println("¬ведите элементы массива:");
		for (int i = 0; i < size; i++) {
			mas[i] = sc.nextInt();
		}
		int per;
		for (int i = 0; i < (size/2); i++) {
			per = mas[i];
			mas[i] = mas[(size - 1) - i];
			mas[(size - 1) - i] = per;						}
		System.out.println("«еркальный вид массива:\n"+ Arrays.toString(mas));
		System.out.println("¬ведите индекс элемента массива:");
		int i = sc.nextInt();
		System.out.println("Ёлемента массива: " + mas[i]);
	}
}