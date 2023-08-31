package self_made;

public class Exer13 {
        public static String chromosomeCheck(String sperm) {
            String congratulations = null;
            if (sperm.equals("XX")){
                    congratulations ="Congratulations! You're going to have a daughter.";
        } else if (sperm.equals("XY")) {
                congratulations="Congratulations! You're going to have a son.";

            }
        return congratulations;}
}
