import java.util.Scanner;

public class Selection2Exp305 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner (System.in);

        String category;
        int income, netSalary;
        double tax = 0; 

        System.out.println("Input Category : ");
        category = input05. nextLine();
        System.out.println("Input Income = ");
        income = input05. nextInt();

        if ( category.equalsIgnoreCase("worker")){ 
            if(income <= 2000000)
              tax = 0.1;
            else if (income <= 3000000)
              tax =0.15;
            else 
              tax = 0.2;
            netSalary = (int) (income - (tax*income)); 
            System.out.println("Nett salary = "+netSalary);
        }else if ( category.equalsIgnoreCase( "businessman")){
            if(income <=2500000)
              tax = 0.15;
            else if (income <= 3500000)
              tax = 0.2;
            else 
              tax = 0.25;
            netSalary = (int) (income - (tax*income)); 
            System.out.println("Nett salary = "+netSalary);
        }else 
            System.out.println("invalid category");
    }
}
