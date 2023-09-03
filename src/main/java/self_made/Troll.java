package self_made;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Troll {


    public static String disemvowel(String str) {
        List<Character> charList = new ArrayList<>();
        for (char c : str.toCharArray()) {
            charList.add(c);
        }
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        List<Character> withoutVowels = new ArrayList<>();
        for (Character d : charList) {
            if (vowels.contains(d)) {
                continue;
            }
            withoutVowels.add(d);
        }

        return withoutVowels.toString();
    }}


