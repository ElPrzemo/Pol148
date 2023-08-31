package self_made;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static String getOrder(String input) {
    List<String> menu = new ArrayList<>();
        menu.add("Burger");
        menu.add("Fries");
        menu.add("Chicken");
        menu.add("Pizza");
        menu.add("Sandwich");
        menu.add("Onionrings");
        menu.add("Milkshake");
        menu.add("Coke");

        for (String word : menu) {
        input = input.replace(word, " ");
    }

    String[] parts = input.trim().split("\\s+");
    StringBuilder result = new StringBuilder();

        for (String part : parts) {
        if (!part.isEmpty()) {
            result.append(Character.toUpperCase(part.charAt(0))).append(part.substring(1)).append(" ");
        }
    }

        return result.toString().trim();
}}


