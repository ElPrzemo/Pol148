package self_made.exer11;

public class Divisible {
    public static boolean isDivisible(int x, int y, int z) {
        int counter = 0;
        if (x % y == 0) {
            counter++;
        } else if (x % z == 0) {
            counter++;
        }

        if (counter == 2) {
            return true;
        }
        return false;
    }
}
