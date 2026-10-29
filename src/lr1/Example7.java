package lr1;
import java.util.Scanner;
public class Example7 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input Name: ");
        String name = in.nextLine();

        System.out.println("Input Age:");
        int age = in.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
