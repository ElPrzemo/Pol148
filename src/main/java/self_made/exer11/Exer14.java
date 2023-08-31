package self_made.exer11;

public class Exer14 {
    public static String stringy(int size) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < size; i++) {
            if (i % 2 != 0) {
                result.append("1");
            } else {
                result.append("0");
            }
        }
        return result.toString();
    }
}
