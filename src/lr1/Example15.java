package lr1;
import java.util.Scanner;
public class Example15 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Первое число равно = ");
        int a = in.nextInt();

        System.out.println("Второе число равно = ");
        int b = in.nextInt();

        System.out.println("Сумма чисел = " + (a + b));
        System.out.println("Разность чисел = " + (a - b));
    }
}
