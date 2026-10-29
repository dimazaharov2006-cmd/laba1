package lr1;
import java.util.Scanner;
public class Example14 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int a = in.nextInt();

        System.out.println("Число, меньше данного на единицу = " + (a - 1));
        System.out.println("Данное число = " + a);
        System.out.println("Число, больше данного на единицу = " + (a + 1));
    }
}
