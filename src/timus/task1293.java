package timus;
import java.util.Scanner;
public class task1293 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество прямоугольных панелей(N) = ");
        int N = in.nextInt();

        System.out.println("Длина прямоугольника (в метрах) = ");
        int A = in.nextInt();

        System.out.println("Ширина прямоугольника (в метрах) = ");
        int B = in.nextInt();

        System.out.println("Необходимо сульфида тория - " + (A * B * N * 2) + " 10^-9 г.");
    }
}