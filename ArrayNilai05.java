import java.util.Scanner;

public class ArrayNilai05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* soal sesuai jobsheet awal
        int [] nilaiAkhir = new int[10];
        for ( int i = 0; i < nilaiAkhir.length; i++){
            System.out.print("Masukkan Nilai Akhir " + i + " : ");
            nilaiAkhir[i] = input.nextInt();
        }
        for (int i = 0; i <10; i++){
            System.out.println("Nilai akhir ke-" + i + " adalah = " + nilaiAkhir[i]);
        } 
        */

        /*  modify sesuai jobsheet question 1 
        int [] nilaiAkhir = new int[10];
        for ( int i = 0; i < nilaiAkhir.length; i++){
            System.out.print("Masukkan Nilai Akhir " + i + " : ");
            nilaiAkhir[i] = input.nextInt();
        }
        for (int i = 0; i <10; i++){
            System.out.println("Nilai akhir ke-" + i + " adalah = " + nilaiAkhir[i]);
        } */

        // modify sesuai jobsheet question 3 dan 4
        int [] nilaiAkhir = new int[10];
        for ( int i = 0; i < nilaiAkhir.length; i++){
            System.out.print("Masukkan Nilai Akhir " + i + " : ");
            nilaiAkhir[i] = input.nextInt();
        }
        for (int i = 0; i <10; i++){
            if (nilaiAkhir [i] > 70 ){
            System.out.println("Mahasiswa ke-" + i + " dengan nilai akhir :  " + nilaiAkhir[i] + " lulus !");
            }else {
                System.out.println("Mahasiswa ke-" + i + " dengan nilai akhir :  " + nilaiAkhir[i] + " Tidak Lulus !");
            }
        }

        input.close();
    }
}
