import java.util.Scanner;

public class TiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harga = 50000;
        int jumlahTiket;
        int totalTiket = 0;
        double totalHarga;
        double diskon = 0;
        double hargaDiskon;
        double totalPenjualan = 0;

        do {

            System.out.println("============================================");
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid.");
                continue;
            }

            if (jumlahTiket > 4 && jumlahTiket <= 10) {
                diskon = 0.10;
            } else if (jumlahTiket > 10) {
                diskon = 0.15;
            } else {
                diskon = 0;
            }

            totalHarga = harga * jumlahTiket;
            hargaDiskon = totalHarga - (totalHarga * diskon);

            System.out.println("Harga: Rp. " + harga);
            System.out.println("Diskon sebesar: " + diskon);
            System.out.println("Total harga: Rp. " + (int)hargaDiskon);

            totalTiket += jumlahTiket;
            totalPenjualan += hargaDiskon;

            System.out.print("\nApakah ingin melanjutkan? (ya/tidak): ");

        } while (sc.next().equalsIgnoreCase("ya"));

        System.out.println("\n============================================");
        System.out.println("Total tiket yang terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp. " + (int)totalPenjualan);
        System.out.println("============================================");

        sc.close();
    }
}