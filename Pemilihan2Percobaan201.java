import java.util.Scanner;

public class Pemilihan2Percobaan201 {
    public static void main(String[] args) {

        double diskon = 0, harga = 0;

        Scanner input01 = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("==============MENU KAFE JTI============");
        System.out.println("=======================================");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------=");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        int pilihan_menu = input01.nextInt();
        input01.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        String member = input01.nextLine();
        System.out.println("---------------------------------------");

        if (member.equals("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            double total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);

        }

        if (member.equals("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            double total_bayar = harga;
            System.out.println("Total bayar = " + total_bayar);

        }
System.out.println("--------------------------------------------");

    }

}
