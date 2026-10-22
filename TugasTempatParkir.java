import java.util.Scanner;

public class TugasTempatParkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

        do {
            System.out.println("");
            System.out.print("Masukkan jenis kendaraan (1 = mobil, 2 = motor, 0 = keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan Durasi parkir: ");
                durasi = sc.nextInt();

                if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }

            } else if (jenis < 0 || jenis > 2) {
                System.out.println("Jenis kendaraan tidak valid");
            } else {
                System.out.println("Program selesai");
            }

        } while (jenis != 0);

        System.out.println("\n=================================================");
        System.out.println("Total biaya parkir adalah Rp. " + total);
        System.out.println("=================================================");
    }
}
