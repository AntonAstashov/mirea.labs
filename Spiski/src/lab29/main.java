package lab29;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[][] roads = new int[N][N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                roads[i][j] = input.nextInt();
                count += roads[i][j];
            }
        }

        System.out.println(count);
    }
}