package self_made.exer11;

public class Kata {
    public static boolean twoArePositive(int a, int b, int c) {
        int counter = 0;
        if (a < 0) {
            counter++;
        } else if (b < 0) {
            counter++;
        } else if (c < 0) {
            counter++;
        }

        if (counter <= 1) {
            return true;
        }
        return false;
    }
}