import java.util.Scanner;

public class PurchasePrice5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String bookBrand; 
        int price, quantity, pageCount;
        double discount, totalPrice, purchasePrice, totalDiscount;


        System.out.println("Input book brand");
        bookBrand= input.nextLine();
        System.out.println("Input page count : ");
        pageCount=input.nextInt();
        System.out.println("Input price");
        price=input.nextInt();
        System.out.println("Input discount :");
        discount= input.nextInt();
        System.out.println("Input quantity");
        quantity=input.nextInt();

        totalPrice=price*quantity;
        totalDiscount =totalPrice*discount;
        purchasePrice=totalPrice-totalDiscount;

        System.out.println("The book brand : "+ bookBrand);
        System.out.println("Total discount : "+ totalDiscount);
        System.out.println("Final purchase price : " + purchasePrice);

    }
}
