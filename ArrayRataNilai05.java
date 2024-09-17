import java.util.Scanner;

public class ArrayRataNilai05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*sesuai jobsheet
        int [] nilaiMhs = new int[10];
        double total = 0, rata2;

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs [i] = input.nextInt();
        }

        for (int i = 0; i <nilaiMhs.length; i++){
            total += nilaiMhs[i];
        }
        
        rata2 = total/nilaiMhs.length;
        System.out.println(" Total rata-rata nilai = " + rata2);
        */

        /*   modify sesuai jobsheet question 1 
        int [] nilaiMhs = new int[10];
        double total = 0, rata2;

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs [i] = input.nextInt();
           
        }
        System.out.println("=============================");
        for (int i = 0; i <nilaiMhs.length; i++){
            if (nilaiMhs[i] > 70){
                System.out.println("Mahasiswa dinyatakan lulus" +(i+1));
            }
            total += nilaiMhs[i];
        }
        System.out.println("=============================");

        rata2 = total/nilaiMhs.length;
        System.out.println(" Total rata-rata nilai lulus = " + rata2);
        */
        

        // modify sesuai jobsheet question 2 
        int banyakLulus = 0, index = 0, index1 = 0, index2 = 0;
        System.out.print(" masukkan berapa jumlah mahasiswa : ");
        index = input.nextInt();

        int [] nilaiMhs = new int[index];
        String [] lulus = new String[index];
        double totalLulus = 0, totalTidakLulus = 0, rata2Lulus, rata2tidakLulus;
        

         for (int i = 0; i < nilaiMhs.length; i++){
             System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
             nilaiMhs [i] = input.nextInt();
             if(nilaiMhs [i] > 70 ){
                lulus [i] = "Mahasiswa dinyatakan lulus";
                banyakLulus += 1;
             }else {
                lulus [i] = "Mahasiswa dinyatakan tidakk lulus";
             }
         }for (int i = 0;i < nilaiMhs.length;i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                index1 += 1;
            } else{
                totalTidakLulus += nilaiMhs[i];
                index2 += 1;
            }
         }
         System.out.println("=============================");
         for (int i = 0;i < lulus.length;i++) {
            System.out.println("Mahasiswa ke-"+ (i+1) + " " +lulus[i]);
         }
         System.out.println("=============================");

        rata2Lulus = totalLulus/nilaiMhs.length;
        System.out.println(" Total rata-rata nilai lulus = " + rata2Lulus);
        rata2Lulus = totalLulus/index1;
        rata2tidakLulus = totalTidakLulus/index2;
        System.out.println("Rata-rata nilai mahasiswa yang lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai mahasiswa yang tidak lulus = " + rata2tidakLulus);
        System.out.println("Banyaknya mahasiswa yang lulus: " + banyakLulus);
    
         } 
    }

    
    

