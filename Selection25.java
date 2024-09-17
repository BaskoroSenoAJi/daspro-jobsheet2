import java.util.Scanner;

public class Selection25 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner (System.in) ;

        System.out.println("Nilai uas : ");
        float finalExam = input05.nextFloat();
        System.out.println("Nilai uts : ");
        float midExam = input05.nextFloat();
        System.out.println("Nilai kuis : ");
        float quiz = input05.nextFloat();
        System.out.println("Nilai tugas :");
        float assignment = input05.nextFloat();
        float total = (finalExam * 0.4F) + (midExam * 0.3F) + (quiz * 0.1F) + (assignment * 0.2F);
        
        String message;
        String grade;
        int curGrade;
        curGrade = (int) total; 
        if ( curGrade >=80) { 
            grade = "A";
            message ="mission success";

        }else if (curGrade >=73) { 
            grade = "B+";
            message = "it's enough";


         } else if (curGrade >=65 ) { 
            grade = "B";
            message = "better keep improve it";

         }else if (curGrade >=60) {
            grade = "C+";
            message = "heads up king";

         }else if (curGrade >=50) {
            grade = "C";
            message = "never too late to learn";

         }else if (curGrade >=39) {
            grade = "D";
            message = "learn how to learn";

         }else {
            grade = "E";
            message = "stop being pea brain ";
         }
        
         System.out.println("your grade is : " + grade + "\n" + "motivation message : " + message );
        }

        
        /* 
        String message = total < 65 ? "Retake" : "Pass" ; 

        System.out.println("Final Grade = " + total + " and the decision is " + message); */



    }

