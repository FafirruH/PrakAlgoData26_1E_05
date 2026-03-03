package Praktikum03;

import java.util.Scanner;

public class MataKuliahDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Data Matakuliah : ");
        int jmlhmk = sc.nextInt();
        sc.nextLine();

        MataKuliah05[] arrayOfMataKuliah05 = new MataKuliah05[100];
        int jumlahData = 0;

        for (int i = 0; i < jmlhmk; i++) {

            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            System.out.print("Kode        : ");
            String kode = sc.nextLine();
            System.out.print("Nama        : ");
            String nama = sc.nextLine();
            System.out.print("SKS         : ");
            int sks = Integer.parseInt(sc.nextLine());
            System.out.print("Jumlah Jam  : ");
            int jumlahJam = Integer.parseInt(sc.nextLine());

            arrayOfMataKuliah05[jumlahData] = new MataKuliah05(kode, nama, sks, jumlahJam);

            jumlahData++;
        }

        System.out.print("Tambah Data? (Ya/Tidak): ");
        String pilihan = sc.nextLine();

        while (pilihan.equalsIgnoreCase("ya")) {

            System.out.print("Berapa Matakuliah Yang Akan Ditambah : ");
            int tambah = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < tambah; i++) {

                System.out.println("Masukkan Data Mata Kuliah ke-" + (jumlahData + 1));
                System.out.print("Kode        : ");
                String kode = sc.nextLine();
                System.out.print("Nama        : ");
                String nama = sc.nextLine();
                System.out.print("SKS         : ");
                int sks = Integer.parseInt(sc.nextLine());
                System.out.print("Jumlah Jam  : ");
                int jumlahJam = Integer.parseInt(sc.nextLine());

                arrayOfMataKuliah05[jumlahData] = new MataKuliah05(kode, nama, sks, jumlahJam);

                jumlahData++;
            }

            System.out.print("Tambah Data lagi? (Ya/Tidak): ");
            pilihan = sc.nextLine();
        }

        System.out.println("\n=== DATA MATA KULIAH ===");
        for (int i = 0; i < jumlahData; i++) {
            arrayOfMataKuliah05[i].CetakInfo();
        }

        sc.close();
    }
}