import java.util.HashMap;
import java.util.Map;

public class Example2 {

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        int sameFirstNameCount = getSameFirstNameCount(map);
        int sameLastNameCount = getSameLastNameCount(map);
        System.out.println("Число людей с одиновым именем: " + sameFirstNameCount);
        System.out.println("Число людей с одиновой фамилией: " + sameLastNameCount);
    }

    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Smith", "John");
        map.put("Johnson", "Mary");
        map.put("Williams", "John");
        map.put("Brown", "Emily");
        map.put("Jones", "Michael");
        map.put("Taylor", "David");
        map.put("Miller", "Sarah");
        map.put("Wilson", "John");
        map.put("Moore", "Jessica");
        map.put("Anderson", "Emily");
        return map;
    }

    public static int getSameFirstNameCount(Map<String, String> map) {
        int count = 0;
        for (String value : map.values()) {
            if (value.equals("John")) {
                count++;
            }
        }
        return count;
    }

    public static int getSameLastNameCount(Map<String, String> map) {
        int count = 0;
        for (String key : map.keySet()) {
            if (key.equals("Smith")) {
                count++;
            }
        }
        return count;
    }
}