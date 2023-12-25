package lab26;

import java.util.Stack;

public class Example1 {
    public static void invertArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        // Перекладываем элементы массива в стек
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        // Записываем элементы стека обратно в массив
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        // Пример использования метода
        int[] arr = {1, 2, 3, 4, 5};
        invertArray(arr);

        // Выводим результат
        for (int num : arr) {
            System.out.print(num + " "); // Вывод: 5 4 3 2 1
        }
    }
}
