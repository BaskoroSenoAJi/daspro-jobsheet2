import java.util.Scanner;

public class Star05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        // jobsheet question default 
        System.out.print("Enter the value of N : ");
        int N = input.nextInt();

        for ( int i = 1; i <= N; i++) {
            System.out.print(" * ");
        }
        

        /* modify program based on question number 1 
        System.out.println("Enter the value of N : ");
        int N = input.nextInt();

        for ( int i = 0; i <= N; i++) {
            System.out.print(" * ");
        }

        (Outputs plus by one)
        */ 

        /*  modify program based on question number 2 
        System.out.println("Enter the value of N : ");
        int N = input.nextInt();

        for ( int i = 1; i > N; i++) {
            System.out.print(" * ");
        }

        //(doesnt have any outputs because it doesn't meet the conditions requirements )
         */

        /*modify program based on question number 3 
        System.out.println("Enter the value of N : ");
        int N = input.nextInt();

        for ( int i = 1; i <= N; i--) {
            System.out.print(" * ");
        }

        (doesnt have any outputs because it doesn't meet the conditions requirements )
        */
        
    }
}

    


