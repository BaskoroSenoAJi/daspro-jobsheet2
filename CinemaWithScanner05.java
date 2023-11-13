import java.util.Scanner;

public class CinemaWithScanner05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int row, column; 
        String name, next; 
        String [][] audience = new String [4][2];

        /* 
        while (true) {
            System.out.print("Enter a name : ");
            name = input.nextLine();
            System.out.print("Enter row number : ");
            row = input.nextInt();
            System.out.print("Enter column number : ");
            column = input.nextInt();
            input.nextLine();

            audience[row - 1][column - 1] = name; 
            System.out.print("Are there any other audiences to be added ? (yes/no) : ");
            next = input.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
            
        }
        */

        /* modify the program based on question 2
        while (true) {
        System.out.println("1. Menu Input Data ");
        System.out.println("2. Show Audience List ");
        System.out.println("3. Exit");
        System.out.print("Enter your choice : ");
        int choose = input.nextInt();
        input.nextLine();
        switch (choose) {
            case 1 :
            System.out.println("Input your Data : " );
            System.out.println("==================");
            System.out.print("Enter a name : ");
            name = input.nextLine();
            System.out.print("Enter row number : ");
            row = input.nextInt();
            System.out.print("Enter column number : ");
            column = input.nextInt();
            input.nextLine();
            audience[row - 1][column - 1 ] = name;
            break;
            case 2 :
            for (int i = 0; i < audience.length; i++) {
                for (int j = 0; j < audience[i].length; j++) {
                    System.out.print(audience[i][j] + " ");
                }
                System.out.println();
            }
            break; 
            case 3 : 
                System.exit(0);
                break;
        } 
    }
    */

    /*  modify program based on question 4
    while (true) {
        System.out.println("1. Menu Input Data ");
        System.out.println("2. Show Audience List ");
        System.out.println("3. Exit");
        System.out.print("Enter your choice : ");
        int choose = input.nextInt();
        input.nextLine();
        switch (choose) {
            case 1 :
            System.out.println("Input your Data : " );
            System.out.println("==================");
            System.out.print("Enter a name : ");
            name = input.nextLine();
            System.out.print("Enter row number : ");
            row = input.nextInt();
            System.out.print("Enter column number : ");
            column = input.nextInt();
            input.nextLine();
            System.out.println();
            if( row - 1  < audience.length && column - 1 < audience[0].length && row - 1 >= 0 && column - 1 >= 0){
                audience[row - 1][column - 1 ] = name;
                System.out.println("Data Input Successfully ");
            }else{
                System.out.println("Invalid Data");
            }
            break;
            case 2 :
            for (int i = 0; i < audience.length; i++) {
                for (int j = 0; j < audience[i].length; j++) {
                    System.out.print(audience[i][j] + " ");
                }
                System.out.println();
            }
            break; 
            case 3 : 
                System.exit(0);
                break;
            default :
            System.out.println("Input the right choose");
        } 
    }
    */



    /* modify the program based on question 4
    while (true) {
        System.out.println("1. Menu Input Data ");
        System.out.println("2. Show Audience List ");
        System.out.println("3. Exit");
        System.out.print("Enter your choice : ");
        int choose = input.nextInt();
        input.nextLine();
        switch (choose) {
            case 1 :
            System.out.println("Input your Data : " );
            System.out.println("==================");
            System.out.print("Enter a name : ");
            name = input.nextLine();
            System.out.print("Enter row number : ");
            row = input.nextInt();
            System.out.print("Enter column number : ");
            column = input.nextInt();
            input.nextLine();
            System.out.println();
            if(audience[row-1][column-1]!= null ){
                System.out.println("==================");
                System.out.println("Seat already filled");
                System.out.println("==================");
                System.out.println();
                break;
            }
            audience[row - 1][column - 1 ] = name;
            break;
            case 2 :
            for (int i = 0; i < audience.length; i++) {
                for (int j = 0; j < audience[i].length; j++) {
                    System.out.print(audience[i][j] + " ");
                }
                System.out.println();
            }
            break; 
            case 3 : 
                System.exit(0);
                break;
        } 
    }
    */

    //
    while (true) {
        System.out.println("1. Menu Input Data ");
        System.out.println("2. Show Audience List ");
        System.out.println("3. Exit");
        System.out.print("Enter your choice : ");
        int choose = input.nextInt();
        input.nextLine();
        switch (choose) {
            case 1 :
            System.out.println("Input your Data : " );
            System.out.println("==================");
            System.out.print("Enter a name : ");
            name = input.nextLine();
            System.out.print("Enter row number : ");
            row = input.nextInt();
            System.out.print("Enter column number : ");
            column = input.nextInt();
            input.nextLine();
            System.out.println();
            if(audience[row-1][column-1]!= null ){
                System.out.println("==================");
                System.out.println("Seat already filled");
                System.out.println("==================");
                System.out.println();
                break;
            }
            audience[row - 1][column - 1 ] = name;
            break;
            case 2 :
            for (int i = 0; i < audience.length; i++) {
                for (int j = 0; j < audience[i].length; j++) {
                    if (audience[i][j] == null) {
                        audience [i][j] = "**";
                    }
                }
            }
            for (int i = 0; i < audience.length; i++) {
                for (int j = 0; j < audience[i].length; j++) {
                    System.out.print(audience[i][j] + " ");
                }
                System.out.println();
            }
            break; 
            case 3 : 
                System.exit(0);
                break;
        } 
    }
    // 

}
}

