import java.util.Scanner;

public class Selection2Exp15 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner (System.in); 

        System.out.println(" Input year : ");
        int year = input05. nextInt(); 

        if (year%4 == 0)
           if (year%100 == 0 && year%400 == 0)
           System.out.println("Leap Year");

        else 
           System.out.println("Not a leap year");    
           
/* Statements awal 
        if (year%4 == 0)
           if ( year%100 != 0 )
             System.out.println("Leap Year");

        else 
             System.out.println("Not a leap year");
*/

        input05.close();

    }
}
