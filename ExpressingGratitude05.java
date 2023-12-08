public class ExpressingGratitude05 {
   
    // functions 1 
    public static String getGreetingRecipient() {
        Scanner input = new Scanner(System.in);
        System.out.print("Inpput the name of people you want to greet : ");
        String recipientName = input.nextLine();
        input.close();
        return recipientName;
    }

    // functions 2 
    public static void sayThankyou (){
        String name = getGreetingRecipient();
        System.out.println("Thank you "+name+" for being the best teacher in the world. \n" +"You inspired in me a love for learning and made me feel like i could ask you anything. ");
    }

    // functions 3 
    public static void sayAdditionalGreetings (String ssup){
        System.out.println("Best Regard Alex");
    }
        

    public static void main(String[] args) {
        sayThankyou();
            sayAdditionalGreetings("Thankyou,");
    }

}

