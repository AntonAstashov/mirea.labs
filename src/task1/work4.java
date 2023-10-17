package task1;

import java.util.Scanner;

public class work4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите размер массива: ");
    int size = scanner.nextInt();

    int[] array = new int[size];

    System.out.println("Введите элементы массива:");
    for (int i = 0; i < size; i++) {
        array[i] = scanner.nextInt();
    }

    int sum = 0;
    int max = array[0];
    int min = array[0];
    int i = 0;

    // Сумма элементов с использованием do while
    do {
        sum += array[i];
        i++;
    } while (i < size);

    // Поиск максимального элемента с использованием while
    i = 0;
    while (i < size) {
        if (array[i] > max) {
            max = array[i];
        }
        i++;
    }

    // Поиск минимального элемента с использованием for
    for (i = 0; i < size; i++) {
        if (array[i] < min) {
            min = array[i];
        }
    }

    System.out.println("Сумма элементов массива: " + sum);
    System.out.println("Максимальный элемент массива: " + max);
    System.out.println("Минимальный элемент массива: " + min);
}

}

