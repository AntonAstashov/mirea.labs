package task1;
import java.util.Scanner;
public class Example7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 1;
        System.out.print("Введите число факториала: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
