package self_made.exer11;

public class EvenOrOdd2 {

        public static String even_or_odd(int [] array) {
            String getback = null;
            for (Integer integ: array) {
                if (integ%2==0){
                    getback="Even";
                } else if
                (integ%2!=0){
                    getback= "Odd";
                }
            }
            return getback;}
    }

