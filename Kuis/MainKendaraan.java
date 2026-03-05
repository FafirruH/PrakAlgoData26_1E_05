package Kuis;

import java.util.Scanner;

public class MainKendaraan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah kendaraan: ");
        int n = sc.nextInt();
        sc.nextLine();

        kendaraan[] daftar = new kendaraan[n];

        // Input data kendaraan
        for (int i = 0; i < n; i++) {
            System.out.println("\nData Kendaraan ke-" + (i + 1));
            System.out.print("Nomor Plat: ");
            String plat = sc.nextLine();
            System.out.print("Jarak Tempuh (km): ");
            double jarak = sc.nextDouble();
            System.out.print("Konsumsi BBM (liter): ");
            double bbm = sc.nextDouble();
            sc.nextLine();

            daftar[i] = new kendaraan(plat, jarak, bbm);
        }

        // Menampilkan semua data
        System.out.println("\n=== Data Kendaraan ===");
        for (int i = 0; i < n; i++) {
            daftar[i].printData();
            System.out.println("----------------------");
        }

        // Mencari kendaraan paling efisien
        kendaraan palingEfisien = daftar[0];
        for (int i = 1; i < n; i++) {
            if (daftar[i].nilaiEfisiensi > palingEfisien.nilaiEfisiensi) {
                palingEfisien = daftar[i];
            }
        }
        // Menampilkan kendaraan paling efisien
        System.out.println("Kendaraan Paling Efisien:");
        System.out.println("Nomor Plat: " + palingEfisien.nomorPlat);
        System.out.println("Nilai Efisiensi: " + palingEfisien.nilaiEfisiensi);

        sc.close();
    }
}