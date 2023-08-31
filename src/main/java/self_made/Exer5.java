package self_made;


import java.util.List;
import java.util.stream.Collectors;


public class Exer5 {


    public  List<String> filterA(List<String> list) {
        List<String> newList = list.stream()
                .filter(s -> s.length() <= 3)
                .filter(s -> s.charAt(0) == 'A' || s.charAt(0) == 'a')
                .collect(Collectors.toList());

        return newList;
    }


}
