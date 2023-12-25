package SpiskiLab1;

public class Example12 {
    public static void main(String[] args) {
        // Создание объекта ListElement
        Example1 listElement = new Example1("", 0, "");

        // Считывание атрибутов с консоли
        listElement.readAttributesFromConsole();

        // Вывод атрибутов на экран
        listElement.displayAttributes();
    }
}
