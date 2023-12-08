import java.util.Scanner;

public class Assignment1105 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    /* Assignment Question 1 
    System.out.print("Input the Value of N = ");
    int N = scan.nextInt();
    if (N>=3) {
    int i = 1;
        while (i<=N) {
        int j = 1;
        while (j<=i) {
            System.out.print(j);
            j++;
        }
        System.out.println();
        i++;
        }   
    }
    else{
        System.out.println("Minimum input number is  3 ");
        }
    */

    /* Assignment Question 2 
    System.out.print("Input the Value of N = ");
    int N = scan.nextInt();
    if (N>=5) {
        int i = N;
        while (i>=1) {
        int j = 1;
            while (j<=i) {
            System.out.print("*");
            j++;
            }
        System.out.println();
        i--;
        }
    }else{
        System.out.println("minimum input 5 ");
        }
    */

    // Assignment Question 3 
    System.out.print("Input Value of X : ");
    int x = scan.nextInt();
        for (int i = 0;i < x; i++){
            for(int j=0; j<x; j++){
            if (i==x-1 || i==0 || j==0 || j==x-1)
                System.out.print(x);
            else
            System.out.print(" ");
            }
            System.out.println();
        }
    //
    }
}
