import java.util.Scanner;

public class DoWhileLeaveEntitlement05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int leaveEntitlement, numLeave;
        String confirmation;

        System.out.print("leave entitlement : ");
        leaveEntitlement = input.nextInt();

        do{
            System.out.print("Do you want to take leave entitlement (t/f) ? ");
            confirmation = input.next();

            if(confirmation.equalsIgnoreCase("t")){
                System.out.print("Total Days : ");
                numLeave = input.nextInt();

                if(numLeave <= leaveEntitlement){
                    leaveEntitlement -= numLeave;
                    System.out.println("Leave Entitlement left : " + leaveEntitlement);
                } else if ( leaveEntitlement == 0){
                    break;
                }else {
                    System.out.println("The remaining leave entitlement is not sufficient ");
            
                }
            }else {
                break;
            }
        }while (leaveEntitlement > 0 );
    } 
}
