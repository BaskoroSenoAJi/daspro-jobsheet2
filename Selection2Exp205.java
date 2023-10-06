import java.util.Scanner;

public class Selection2Exp205 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner (System.in);

        System.out.println("Input angle 1 : ");
        int angle1 = input05. nextInt();

        System.out.println("Input angle 2 : ");
        int angle2 = input05. nextInt();

        System.out.println("Input angle 3 : ");
        int angle3 = input05. nextInt ();

        int totalAngle;

        totalAngle = angle1 + angle2 + angle3;

        if(totalAngle == 180 )
         if(angle1 == 90 || angle2 == 90 || angle3 == 90)
            System.out.println("Right Triangle ");
        else 
            System.out.println("Not a right Triangle");  
        else 
            System.out.println(" Not a triangle ");


    input05.close();
    }
}
