package lab20;

public class Main {
    public static void main(String[] args) {
        MyClass<Integer, String, Double> object = new MyClass<>(20, "old", 20.0);

        System.out.println("T: " + object.getT());
        System.out.println("V: " + object.getV());
        System.out.println("K: " + object.getK());

        System.out.println(object.toString());

        object.displayTypes();
    }
}
