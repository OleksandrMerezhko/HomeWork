package les1;
import java.util.Scanner;

public class L7_EnterStr {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числа а и b: ");
        int a = scanner.nextInt(), b = scanner.nextInt();
        System.out.println("Вы ввели " + a + " и " + b);
        System.out.println("a+b=" + (a+b));
        System.out.println("a-b=" + (a-b));
        System.out.println("a*b=" + (a*b));
        System.out.println("a/b=" + ((double)a/b));
    }
}
