package main;

import java.util.Scanner;

public class PairNumbers {

    public static void main(String[] args) {

        int[] vect = readUserInput();
        showPairNumbers(vect);
    }

    public static int[] readUserInput() {

        Scanner sc = new Scanner(System.in);

        int n;
        int pair;

        System.out.print("How many numbers? ");
        n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();
        }
        sc.close();
        return vect;
    }

    private static void showPairNumbers(int[] vect){

        System.out.println("\nPair numbers:");

        int pair = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                System.out.printf("%d  ", vect[i]);
                pair++;
            }
        }

        System.out.printf("\n\nAmount of pairs = %d\n", pair);
    }
}