package self_made;

import java.util.ArrayList;
import java.util.List;

public class Exer3 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList();

        numbers.add(10);
        numbers.add(115);
        numbers.add(62);
        numbers.add(345);
        numbers.add(168);
        numbers.add(32);
        numbers.add(450);
        numbers.add(120);

    }


    public static double returnAverage(List<Integer> list){
        double sum = list.stream()
                .reduce((a,b)->a+b).get();

        return sum/list.size();
    }



}
