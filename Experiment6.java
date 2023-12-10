import java.util.Scanner;

public class Experiment6 {
     /* Without using functions 
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol; 

        System.out.print("Input Length : ");
        p = input.nextInt();
        System.out.print("Input Width : ");
        l = input.nextInt();
        System.out.print("Input Height : ");
        t = input.nextInt();

        L = p*l;
        System.out.println("Area of the rectangle = " + L );
        vol = p*l*t;
        System.out.println("Volume of the rectangle = " + vol );
        */

        // Using Functions 
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol; 

        System.out.print("Input Length : ");
        p = input.nextInt();
        System.out.print("Input Width : ");
        l = input.nextInt();
        System.out.print("Input Height : ");
        t = input.nextInt();

        L = calculateArea(p, l);
        System.out.println("Area of a rectangle is = " + L);
        vol = calculateVolume(t, p, l);
        System.out.println("Volume of the rectangle = " + vol);
    }

    // Functions Calculate Area
    public static int calculateArea (int l, int w){
        int area = l*w;
        return area;
    }

    //Functions Calculate Volume 
    public static int calculateVolume (int l, int w, int h){
        int vol = calculateArea(l, w)*h;
        return vol;
    }

