package self_made;

import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Napisz jakś liczbę: ");

        int userNumber = scanner.nextInt();

        int reversed = 0;

        while(userNumber != 0) {

            int digit = userNumber % 10;
            reversed = reversed * 10 + digit;


            userNumber /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}




