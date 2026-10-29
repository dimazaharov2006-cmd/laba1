package lr1;
import  java.util.Scanner;
import java.time.Year;
public class Example12 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите возраст: ");
        int age = in.nextInt();

        int currentyear = Year.now().getValue();

        System.out.println("Год рождения: " + (currentyear - age));
    }
}
