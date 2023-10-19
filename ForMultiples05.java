import java.util.Scanner;

public class ForMultiples05 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        int multiple;
        int sum = 0;
        int counter = 0;
        double average;

        System.out.println("Input the multiple = ");
        multiple = input05.nextInt();

        for(int i=1;i<=50;i++){
            if(i%multiple == 0){
                sum = sum + i;
                counter++;
                //System.out.print( i + "-")

            

                System.out.printf("There are %d number that are multiple of %d in range 1 to 50. \n " , counter , multiple);
                System.out.printf(" The sum from all multiples of &d in range 1 s.d 50 is %d. \n" , multiple, sum);
                System.out.printf("The average multiple number % form 1 to 50 is %.2f\\n" + multiple, sum);
            }
        }
    input05.close();
    }
}
