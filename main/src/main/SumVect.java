package main;

import java.util.Scanner;

public class SumVect {

    public static void main(String[] args) {

        double[] vect = readUserInput();
        showSumNumbers(vect);
    }

    public static double[] readUserInput(){
        Scanner sc = new Scanner(System.in);

        int n;
        double sum;
        double media;

        System.out.print("How many numbers? ");
        n = sc.nextInt();

        double[] vect = new double[n];

        for (int i=0; i<n; i++) {
            vect[i] = sc.nextDouble();
        }
        sc.close();
        return vect;
    }

    private static void showSumNumbers(double[] vect){

        double sum = 0;
        for (int i=0; i< vect.length; i++) {
            sum = sum + vect[i];
        }

        int media = (int) (sum / vect.length);

        System.out.print("Values: ");

        for (int i=0; i< vect.length; i++){
            System.out.printf("%.1f ", vect[i]);
        }

        System.out.printf("\nSUM = %.2f\n", sum);
        System.out.printf("\nMEDIA = %.2f\n", media);
    }
}