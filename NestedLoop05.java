import java.util.Scanner;

public class NestedLoop05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        double [][] temps = new double[5][7];

    /* Program based on jobsheet 
    // Input temperature data 
    for (int i = 0; i < temps.length; i++) {
            System.out.println("City : " + i );
        for (int j = 0; j < temps[0].length; j++) {
            System.out.print("Day " + (j+1) + ": ");
            temps[i][j] = input.nextDouble();
        }
        System.out.println();
     }
     // Display temperature data 
     for (int i = 0; i < temps.length; i++) {
            System.out.println("City : " + i );
        for (int j = 0; j < temps[0].length; j++) {
            System.out.println(temps[i][j] + " ");
        }
        System.out.println();
     }
     */
    

    /* Modify Program based on question 2  
    for (int i = 0; i < temps.length; i++) {
            System.out.println("City : " + i );
        for (int j = 0; j < temps[0].length; j++) {
            System.out.print("Day " + (j+1) + ": ");
            temps[i][j] = input.nextDouble();
        }
        System.out.println();
     }
     // Display temperature data using for each 
     for (double[] cityTemps : temps) {
            for (double temp : cityTemps) {
                System.out.print(temp + " ");
            }
            System.out.println();
     }
    */

    /* Modify Program Based on question 3
    for (int i = 0; i < temps.length; i++) {
            System.out.println("City : " + i );
        for (int j = 0; j < temps[0].length; j++) {
            System.out.print("Day " + (j+1) + ": ");
            temps[i][j] = input.nextDouble();
        }
     System.out.println(" ");
     }
     System.out.println("===================================");
     System.out.println("The Row and Column of temperature Data List");
     System.out.println("===================================");
     // Display temperature data using for each 
     for (double[] cityTemps : temps) {
            for (double temp : cityTemps) {
                System.out.print(temp + " ");
            }
            System.out.println();
     }
     System.out.println("===================================");
     System.out.println("The City Temperature Data Average");
     System.out.println("===================================");
     for (int i = 0; i < temps.length; i++) {
        int sum = 0;
    
        for (int j = 0; j < temps[0].length; j++) {
            sum += temps[i][j];
        }
    
        int average = sum / temps[0].length;
        System.out.println("City " + i + ": " + average);
    }
    */

    }
}
