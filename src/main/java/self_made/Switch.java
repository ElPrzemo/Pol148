package self_made;

import java.util.ArrayList;
import java.util.List;

public class Switch {
    public static String switcheroo(String x) {
        List<Character> charList = new ArrayList<>();
        for (char c : x.toCharArray()) {
            charList.add(c);
        }
        for (Character d : charList) {
            if (d == 'a') {
                d = 'b';
            } else if (d == 'b') {
                d = 'a';

            }

        }
        return charList.toString();
    }
}
