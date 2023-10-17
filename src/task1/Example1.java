package task1;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5}; // инициализация массива
        int sum = 0;
        double average;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            array[i] = scanner.nextInt(); // ввод элемента массива
            sum += array[i]; // суммирование элементов массива
        }

        average = (double) sum / array.length; // нахождение среднего арифметического

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое элементов массива: " + average);
    }
}