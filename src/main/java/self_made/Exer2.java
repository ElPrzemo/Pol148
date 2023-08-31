package self_made;

import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wielkość tablicy: ");

        int arraySize = scanner.nextInt();

        int [] numbers = new int[arraySize];

        for (int i = 0; i < arraySize; i++){
            System.out.println("Podaj liczbę, umieszczę ją w tablicy: ");
            int numberToArray= scanner.nextInt();
            numbers[i]=numberToArray;
        }


       bubbleSort(numbers);


        System.out.print("Posortowana tablica: ");
        for (int number : numbers) {
            System.out.print(number + ", ");
        }


    }



    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }}