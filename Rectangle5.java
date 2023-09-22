import java.util.Scanner;

public class Rectangle5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int base,height;
        double area, perimeter;

        System.out.println("Input Base");
        base = sc.nextInt();
        System.out.println("Input Height");
        height = sc.nextInt(); 

        area = base*height;
        perimeter = 2*height + 2*base;
        System.out.println("Area of Rectangle : " + area);
        System.out.println("Perimeter of Rectangle : " + perimeter);

    
    }
}
