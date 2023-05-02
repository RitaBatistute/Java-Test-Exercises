package main;

import java.util.Locale;
import java.util.Scanner;

public class Height {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, miniors;
        double totalheight, mediaheight, smallPercentage;

        System.out.print("How many people? ");
        n = sc.nextInt();

        String[] names = new String[n];
        int[] ages = new int[n];
        double[] heights = new double[n];

        for (int i=0; i<n; i++) {
            System.out.printf("Datas to %d person:\n", i + 1);
            System.out.print("Name: ");
            names[i] = sc.next();
            System.out.print("Age: ");
            ages[i] = sc.nextInt();
            System.out.print("Height: ");
            heights[i] = sc.nextDouble();
        }

        miniors = 0;
        totalheight = 0;
        for (int i=0; i<n; i++) {
            if (ages[i] < 16) {
                miniors++;
            }
            totalheight = totalheight + heights[i];
        }

        mediaheight = totalheight / n;
        smallPercentage = ((double)miniors / n) * 100.0;

        System.out.printf("\nMedia height = %.2f\n", mediaheight);
        System.out.printf("People under 16 years old: %.1f%%\n", smallPercentage);

        for(int i=0; i<n; i++) {
            if (ages[i] < 16) {
                System.out.printf("%s\n", names[i]);
            }
        }

        sc.close();
    }
}