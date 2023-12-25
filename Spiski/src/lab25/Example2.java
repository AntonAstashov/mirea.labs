package lab25;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Example2 {
    public static void main(String[] args) {
        String pattern = "abcdefghijklmnopqrstuv18340";

        String input1 = "abcdefghijklmnopqrstuv18340";
        String input2 = "abcdefghijklmnoasdfasdpqrstuv18340";


        Pattern p = Pattern.compile(pattern);
        Matcher m1 = p.matcher(input1);
        Matcher m2 = p.matcher(input2);

        if (m1.matches()) {
                System.out.println("Шаблон  соблюдается в строке 1");
            } else {
                System.out.println("Шаблон не соблюдается в строке 1");
            }

            if (m2.matches()) {
                System.out.println("Шаблон соблюдается в строке 2");
            } else {
                System.out.println("Шаблон не соблюдается в строке 2");
            }
        }
}
