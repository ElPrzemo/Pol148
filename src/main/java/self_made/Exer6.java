package self_made;

import java.util.List;
import java.util.stream.Collectors;

public class Exer6 {

    public void getBack(List<Integer>list){
        List<Integer> newList1 = list.stream()
                .filter(a->(a%2==0))
                .collect(Collectors.toList());

        List<Integer> newList2 = list.stream()
                .filter(a->(a%2!=0))
                .collect(Collectors.toList());

        int bothListLength = newList1.size()+newList2.size();

        for (int i=0; i<bothListLength; i++) {
            System.out.println("e" + newList1.get(i));
            System.out.println("o" + newList2.get(i));
        }
    }
}
