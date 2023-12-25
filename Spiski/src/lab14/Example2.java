package lab14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Example2 {
    public static void main(String[] args) {
        String text = "Пример текста с ценами: 25.98 USD, 44 ERR, 0.004 EU, 120 RUB.";

        String regex = "\\b(\\d+(\\.\\d{1,2})?)\\s+(USD|RUB|EU)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            double price = Double.parseDouble(matcher.group(1));
            String currency = matcher.group(3);

            System.out.println("Цена: " + price + " " + currency);
        }
    }
}
