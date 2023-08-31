package self_made;

import java.util.List;
import java.util.stream.Collectors;

public class Exer4 {

    public static void main(String[] args) {

    }

    public static List <String> upperCase (List <String > list) {
        return list. stream()
                .map (String ::toUpperCase)
                .collect(Collectors.toList());

    }}

