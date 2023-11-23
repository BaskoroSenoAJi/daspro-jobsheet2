import java.util.Scanner;

public class SquareStar05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* The Jobsheet Base Program
        System.out.print("Enter Value of N : ");
        int N = input.nextInt();

        for (int iOuter = 1; iOuter <= N; iOuter++) {
            for (int i = 1; i <= N; i++) {
                System.out.print(" * ");
                }
         System.out.println("");
        }
        */

        /* Modify the program as question 1
        System.out.print("Enter Value of N : ");
        int N = input.nextInt();

        for (int iOuter = 0; iOuter <= N; iOuter++) {
            for (int i = 1; i <= N; i++) {
                System.out.print(" * ");
                }
         System.out.println("");
        } 
        // the output every adding one plus row because index start from 0 
        */

        /* Modify the program as question 2
        System.out.print("Enter Value of N : ");
        int N = input.nextInt();

        for (int iOuter = 0; iOuter <= N; iOuter++) {
            for (int i = 0; i <= N; i++) {
                System.out.print(" * ");
                }
         System.out.println("");
        } 
        // the output every adding one plus column because index start from 0 
        */

    }
}
