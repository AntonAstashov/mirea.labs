package SpiskiLab1;

import java.util.Scanner;
public class Example1 {
    private String name;
    private int age;
    private String city;


    public Example1(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public void readAttributesFromConsole() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя студента: ");
        this.name = scanner.nextLine();

        System.out.print("Введите возраст студента: ");
        this.age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Введите город студента:");
        this.city = scanner.nextLine();


    }

    public void displayAttributes() {
        System.out.println("Имя студента: " + this.name);
        System.out.println("Возраст студента: " + this.age);
        System.out.println("Город студента:" + this.city);
    }


}
