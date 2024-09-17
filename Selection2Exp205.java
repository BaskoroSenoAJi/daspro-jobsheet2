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
            //System.out.println("Right Triangle ");

          if ( angle1 == angle2 && angle2 == angle3 )
            System.out.println(" Equilateral Triangle ");
        
          else if ( angle1 == angle2 || angle1 == angle3 || angle2 == angle3)
            System.out.println(" Isosceles Triangle");

        else 
         System.out.println("Not even a Triangle ");
        
            


    input05.close();
    }
}
