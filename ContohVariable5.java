import javax.sound.midi.Soundbank;

public class ContohVariable5 {
public static void main(String[] args) {
    String oneOfMyHobbies = "Playing Basketball";
    boolean isSmart = true;
    char gender = 'M';
    byte _age = 18;
    double $gpa = 4.0, height = 1.80;
    System.out.println(oneOfMyHobbies);
    System.out.println("Are you smart ? " + isSmart);
    System.out.println("Gender : " + gender);
    System.out.println("My current age is: " + _age);
    System.out.println( String. format("My GPA is %s and my height is %s meters" , $gpa, height));

    /* kalau misal gapake print f atau string format masukin satu satu 
    System.out.println("My GPA is : " + $gpa);
    System.out.println("My Height is : " + height); */

    char bloodGroup = 'A'; 
    byte distance = (byte) 130;
    short theNumberOfResidents = 1025; 
    float temperature = 60.50F; 
    double weight = 0.5467812345;
    long balance = 150000000;
    int number = 0x10;

    System.out.println("Blood group \t\t : " + (byte) bloodGroup);
    System.out.println("Distance \t\t : " + distance);
    System.out.println("The number of residents \t : " + theNumberOfResidents);
    System.out.println("Temperature \t\t : " + temperature);
    System.out.println("Weight \t\t\t : " + (float) weight);
    System.out.println("Balance \t\t\t : " + balance);
    System.out.println("Number\t\t\t : " + number);
}
}