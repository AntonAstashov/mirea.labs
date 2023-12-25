package lab25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example12 {
    public static void main(String[] args) {
        String text = "Prices: 25.98 USD, 44 ERR, 0.004 EU, 100 RUВ";

        String usdPattern = "\\d+(\\.\\d{1,2})? USD";
        String rubPattern = "\\d+(\\.\\d{1,2})? RUВ";
        String euPattern = "\\d+(\\.\\d{1,2})? EU";

        Pattern pattern = Pattern.compile(usdPattern + "|" + rubPattern + "|" + euPattern);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String price = matcher.group();
            System.out.println(price);
        }
    }
}

