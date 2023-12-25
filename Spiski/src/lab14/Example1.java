 package lab14;

// это работа 14 , её не было в файле , где 1-15 работа. (13 в дургом реперзиторий)

import java.util.Scanner;
    public class Example1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите строку для разбиения: ");
            String inputString = scanner.nextLine();

            System.out.println("Введите регулярное выражение: ");
            String regex = scanner.nextLine();

            // Используем метод split() для разбиения строки с использованием регулярного выражения
            String[] elements = inputString.split(regex);

            System.out.println("Элементы после разбиения:");
            for (String element : elements) {
                System.out.println(element);
            }
        }
    }
