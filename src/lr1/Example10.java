package lr1;
import java.util.Scanner;
import java.time.Year;
public class Example10 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите год рождения: ");
        int year = in.nextInt();

        int currentyear = Year.now().getValue();

        System.out.println("Вам " + (currentyear - year));
    }
}
