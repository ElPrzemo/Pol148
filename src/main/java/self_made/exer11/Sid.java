package self_made.exer11;

public class Sid {

        public static int simpleMultiplication(int n) {
            int finalScore = 0;
            if(n%2==0){
                finalScore = n*8;
            } else if (n%2!=0) {
                finalScore = n*9;
            }
            return finalScore;
        }
    }

