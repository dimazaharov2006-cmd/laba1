package lr1;
import  java.util.Scanner;
import java.time.Year;
public class Example11 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Введите дату рождения: ");
        int year = in.nextInt();

        int currentyear = Year.now().getValue();

        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + (currentyear - year));
    }
}
