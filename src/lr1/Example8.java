package lr1;
import java.util.Scanner;
public class Example8 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input day of the week: ");
        String dayweek = in.nextLine();

        System.out.println("Input date: ");
        int date = in.nextInt();

        System.out.println("Input mouth name (Родительный падеж): ");
        in.nextLine();
        String month = in.nextLine();

        System.out.println(dayweek + ", " + date + " " + month);
    }
}
