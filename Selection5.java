import java.util.Scanner;

public class Selection5 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        System.out.println("Input a number = ");
        int number = input05.nextInt(); 

        // penggunaan if else 
        /*if (number%2 == 0){
            System.out.println(number + " is an even number!");

        }else{
            System.out.println(number + "is an odd number !");

        }*/

        // penggunaan ternary operator 
        String result;
         result = (number%2 == 0) ? " is an even number !" : " is an odd number !";
        System.out.println( number + result );



    }
}