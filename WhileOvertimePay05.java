import java.util.Scanner;

public class WhileOvertimePay05 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int numEmployee, overtimeHours; 
        int overtimePay = 0;
        String position;

        System.out.println("Employee number = ");
        numEmployee = input.nextInt();

        int i=0;
        while(i<numEmployee){
            System.out.print("Position of employee "+ (i+1)+"(director, manager, staff) = ");
            position = input.next();
            System.out.print("Employee"+(i+1)+" overtime hours = " );
            overtimeHours = input.nextInt();
            i++; 

            if(position.equalsIgnoreCase("director")){
                continue;
            }else if (position.equalsIgnoreCase("manager")){
                overtimePay = overtimeHours*100000;
            }else if (position.equalsIgnoreCase("staff")){
                overtimePay=overtimeHours*75000;
            }
            double totalOvertimePay = overtimePay;
            System.out.println("Total of Overtime Pay = " + totalOvertimePay);
        }


    }
}
