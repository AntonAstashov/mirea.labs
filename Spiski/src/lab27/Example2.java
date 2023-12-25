package lab27;

import java.util.HashMap;
import java.util.Map;

public class Example2 {
    public static void main(String[] args) {
        Map<String, Integer> dictionary = new HashMap<>();

        // Добавляем 10 элементов в словарь
        dictionary.put("ключ1", 1);
        dictionary.put("ключ2", 2);
        dictionary.put("ключ3", 3);
        dictionary.put("ключ4", 4);
        dictionary.put("ключ5", 5);
        dictionary.put("ключ6", 6);
        dictionary.put("ключ7", 7);
        dictionary.put("ключ8", 8);
        dictionary.put("ключ9", 9);
        dictionary.put("ключ10", 10);

        // Протестируем функции

        // Получаем значение элемента по заданному ключу
        int value = getValueByKey(dictionary, "ключ5");
        System.out.println("Значение элемента с ключом 'ключ5': " + value);

        // Проверяем, содержит ли словарь элемент с заданным ключом
        boolean containsKey = containsKey(dictionary, "ключ7");
        System.out.println("Словарь содержит элемент с ключом 'ключ7'? " + containsKey);
    }

    // Функция для получения значения элемента по заданному ключу
    public static int getValueByKey(Map<String, Integer> dictionary, String key) {
        if (dictionary.containsKey(key)) {
            return dictionary.get(key);
        }
        // Если ключ не найден, возвращаем значение по умолчанию (например, 0)
        return 0;
    }

    // Функция для проверки, содержит ли словарь элемент с заданным ключом
    public static boolean containsKey(Map<String, Integer> dictionary, String key) {
        return dictionary.containsKey(key);
    }
}