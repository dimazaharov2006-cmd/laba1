package lr1;
import java.util.Scanner;
public class Example9 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите месяц: ");
        String month = in.nextLine();

        System.out.println("Введите количество дней в месяце: ");
        int day = in.nextInt();

        String dayword;
        if (day == 31) dayword = "день";
        else { dayword = "дней";
        }
        {

        }
        System.out.println(month + " имеет " + day + " " + dayword );
    }
}
