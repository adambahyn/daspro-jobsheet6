import java.util.Scanner;

public class Pemilihan2Percobaan01 {

    public static void main(String[] args) {
        
        Scanner input01 = new Scanner(System.in);

        int tahun;

        System.out.print("Masukkan Tahun : ");
        tahun = input01.nextInt();

        // Mengecek apakah tahun kabisat
        if ((tahun % 4) == 0) {
            if ((tahun % 100) == 0) {
                // Tahun yang habis dibagi 100 harus juga habis dibagi 400 untuk menjadi kabisat
                if ((tahun % 400) == 0) {
                    System.out.println("Tahun Kabisat");
                } else {
                    System.out.println("Bukan Tahun Kabisat");
                }
            } else {
                System.out.println("Tahun Kabisat");
            }
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }

    }
}
