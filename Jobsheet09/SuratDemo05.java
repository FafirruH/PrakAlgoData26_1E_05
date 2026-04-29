package Jobsheet09;

import java.util.Scanner;

public class SuratDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat05 stack = new StackSurat05(5);
        int pilih;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = sc.nextInt();

                    Surat05 s = new Surat05(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    break;

                case 2:
                    Surat05 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Memproses surat dari: " + proses.namaMahasiswa);
                    }
                    break;

                case 3:
                    Surat05 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir dari: " + lihat.namaMahasiswa);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cari = sc.nextLine();
                    if (stack.cariSurat(cari)) {
                        System.out.println("Surat ditemukan!");
                    } else {
                        System.out.println("Surat tidak ditemukan.");
                    }
                    break;
            }

        } while (pilih != 5);
        sc.close();
    }
}