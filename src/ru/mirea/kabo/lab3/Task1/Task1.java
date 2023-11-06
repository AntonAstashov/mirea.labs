package ru.mirea.kabo.lab3.MathRandom.Task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int sizeArray = scanner.nextInt();

        // Используя класс 'Random'
        double[] array = generateRandomArray(sizeArray);
        printArray("1) Массив с рандомными числами: ", array);

        Arrays.sort(array);
        System.out.println("\nОтсортированный массив: ");
        printArray(array);

        // Используя метод "Random" класса "Math"
        double[] arraySecond = generateRandomArrayUsingMath(sizeArray);
        System.out.println("\n2) Массив с рандомными числами: ");
        printArray(arraySecond);

        Arrays.sort(arraySecond);
        System.out.println("\nОтсортированный массив: ");
        printArray(arraySecond);
    }

    private static double[] generateRandomArray(int size) {
        Random random = new Random();
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextDouble();
        }
        return array;
    }

    private static double[] generateRandomArrayUsingMath(int size) {
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    private static void printArray(String message, double[] array) {
        System.out.println(message);
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }

    private static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
}


