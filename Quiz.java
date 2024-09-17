import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        char menu = 'y';
        do {
            int number = rand.nextInt(10) + 1; 
            boolean success = false;
            do {
                System.out.print("Guess the number (1-10) : ");
                int answer = input.nextInt();
                input.nextLine();
                success = (answer == number );

                if (answer == number ) {
                    System.out.println("You Guess it Correctly");
                    success = true; 
                } else if (answer < number) {
                    System.out.println("The Number is too small, Try it Again !");
                } else if (answer > number) {
                    System.out.println("The Number is too big, Try it Again !");
                }
            } while (!success);
            System.out.print("Do you want repeat the game (Y/N) : ");
            menu = input.next().charAt(0);
            input.nextLine();
        } while (menu == 'Y' || menu == 'y');
    }
}
