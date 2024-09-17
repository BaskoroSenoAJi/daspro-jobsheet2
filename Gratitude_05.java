public class Gratitude_05 {
    
    public static void sayThankyou() {
        System.out.println("Thank you for being the best teacher in the world. \n" + "You inspired me a love for learning and made me feel like i could ask you anything");
    }

    // Experiment 2.1 
    // Print function without parameters
    /*Print in main using function 
    public static void main(String[] args) {
        sayThankyou();
    }*/

    /* Print in main without function 
    public static void main(String[] args) {
        System.out.println("Thank you for being the best teacher in the world. \n" + "You inspired me a love for learning and made me feel like i could ask you anything");
    }*/

    // Experiment 2.2 
    // Print function with parameters 
    
    public static void sayAdditionalGreetings(String greeting) {
        System.out.println(greeting);
    }

    public static void main(String[] args) {
        sayThankyou();
        String expression = "Thanyou...wish you all the best !! ";
        sayAdditionalGreetings(expression);
    }
}
