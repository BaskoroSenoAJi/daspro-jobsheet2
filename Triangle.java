import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* Jobsheet Based Program
        System.out.print("Enter the value of N : ");
        int N = input.nextInt();
        int i = 0;

        while (i <= N) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
        }
        // The output program will in one line 
    */

    // Modify The Program based on Question  2
        System.out.print("Enter the value of N : ");
        int N = input.nextInt();
        int i = 0;

        while (i <= N) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println(" ");
            i++;
        }
        // The output program will in different and in every line based on the N 
    //

    }
}
