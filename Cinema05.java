import java.util.Scanner;

public class Cinema05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [][] audience = new String [4][2];

        /* code sesuai jobsheet 
        audience [0][0] = "Amin" ;
        audience [0][1] = "Bena" ;
        audience [1][0] = "Candra" ; 
        audience [1][1] = "Dela" ;
        audience [2][0] = "Eka" ;
        audience [2][1] = "Farhan" ;
        audience [3][0] = "Gisel" ;

        System.out.printf("%s \t %s \n", audience [0][0], audience [0][1]);
        System.out.printf("%s \t %s \n", audience [1][0], audience [1][1]);
        System.out.printf("%s \t %s \n", audience [2][0], audience [2][1]);
        System.out.printf("%s \t %s \n", audience [3][0], audience [3][1]);
        */

        /*  modify code base on question 3 and 4
        audience [0][0] = "Amin" ;
        audience [0][1] = "Bena" ;
        audience [1][0] = "Candra" ; 
        audience [1][1] = "Dela" ;
        audience [2][0] = "Eka" ;
        audience [2][1] = "Farhan" ;
        audience [3][0] = "Gisel" ;
        audience [3][1] = "Hana" ;

        System.out.println(audience.length);
        System.out.println(audience[0].length);
        System.out.println(audience[1].length);
        System.out.println(audience[2].length);
        System.out.println(audience[3].length); 
        */

        /*  modify the code base on question 5
        audience [0][0] = "Amin" ;
        audience [0][1] = "Bena" ;
        audience [1][0] = "Candra" ; 
        audience [1][1] = "Dela" ;
        audience [2][0] = "Eka" ;
        audience [2][1] = "Farhan" ;
        audience [3][0] = "Gisel" ;
        audience [3][1] = "Hana" ;

        System.out.println(audience.length);
        for ( int i = 0; i < audience.length; i++){
            System.out.println(" Length of row " + ( i + 1 ) + " : " + audience[i].length);
        }
        */

        // modify code base on question number 6 
        audience [0][0] = "Amin" ;
        audience [0][1] = "Bena" ;
        audience [1][0] = "Candra" ; 
        audience [1][1] = "Dela" ;
        audience [2][0] = "Eka" ;
        audience [2][1] = "Farhan" ;
        audience [3][0] = "Gisel" ;
        audience [3][1] = "Hana" ;

        System.out.println(audience.length);
        for ( int i = 0; i < audience.length; i++){
            System.out.println(" Length of row " + ( i + 1 ) + " : " + audience[i].length);
        }
    }
}
