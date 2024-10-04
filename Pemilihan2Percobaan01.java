import java.util.Scanner;

public class Pemilihan2Percobaan01 {

    public static void main(String[] args) {
        
        Scanner input01 = new Scanner(System.in);

        int tahun;

        System.out.print("Masukkan Tahun : ");
        tahun = input01.nextInt();

        // Mengecek apakah tahun kabisat tanpa menggunakan operator logika
        if (tahun % 4 == 0) {
            if (tahun % 100 == 0) {
                if (tahun % 400 == 0) {
                    // Tahun habis dibagi 100 dan 400, maka tahun kabisat
                    System.out.println("Tahun Kabisat");
                } else {
                    // Tahun habis dibagi 100 tapi tidak habis dibagi 400, maka bukan kabisat
                    System.out.println("Bukan Tahun Kabisat");
                }
            } else {
                // Tahun habis dibagi 4 tetapi tidak habis dibagi 100, maka kabisat
                System.out.println("Tahun Kabisat");
            }
        } else {
            // Tahun tidak habis dibagi 4, maka bukan kabisat
            System.out.println("Bukan Tahun Kabisat");
        }

    }
}
