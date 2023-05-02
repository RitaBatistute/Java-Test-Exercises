package main;

import java.util.Scanner;

public class NegativeNumbers {

    public static void main(String[] args) {

        int[] vect = readUserInput();
        showNegativeNumbers(vect);
    }

    private static int[] readUserInput(){

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("How many numbers? ");
        n = sc.nextInt();

        int[] vect = new int[n];

        for (int i=0; i<n; i++) {
            vect[i] = sc.nextInt();
        }

        sc.close();

        return vect;
    }

    private static void showNegativeNumbers(int[] vect){

        System.out.println("Negatives numbers: ");

        for (int i=0; i<vect.length; i++) {

            if (vect[i] < 0) {
                System.out.printf("%d\n", vect[i]);
            }
        }
    }
}