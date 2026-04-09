package Praktikum06;

import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        MahasiswaBerprestasi list = new MahasiswaBerprestasi();
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa yang akan diinput: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            String ip = sc.nextLine();
            double ipk = Double.parseDouble(ip);
            System.out.println("----------------------------------------");
            list.tambah(new Mahasiswa(nim, nama, kelas, ipk));
        }
        list.tampil();
        System.out.println("----------------------------------------");
        System.out.println("Pencarian data (Sequential Search)");
        System.out.println("----------------------------------------");
        System.out.print("Masukkan IPK mahasiswa yang dicari: ");
        double cariSeq = sc.nextDouble();
        
        System.out.println("----------------------------------------");
        System.out.println("Menggunakan sequential searching");
        double posisi = list.sequentialSearch(cariSeq);
        int pss = (int) posisi;
        list.tampilPosisi(cariSeq, pss);
        list.tampilDataSearch(cariSeq, pss);

        System.out.println("----------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("----------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari=sc.nextDouble();
        System.out.println("----------------------------------------");
        System.out.println("Menggunakan BInary Search");
        System.out.println("----------------------------------------");
        double posisi2= list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2=(int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        sc.close();
    }
}