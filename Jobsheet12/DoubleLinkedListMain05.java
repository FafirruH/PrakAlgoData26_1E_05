package Jobsheet12;

import java.util.Scanner;

public class DoubleLinkedListMain05 {
    static Mahasiswa05 inputMahasiswa(Scanner paps){
        System.out.print("Masukkan NIM   : ");
        String nim = paps.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama =paps.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = paps.nextLine();
        System.out.print("Masukkab IPK   : ");
        String dummy = paps.nextLine();
        double ipk = Double.parseDouble(dummy);
        Mahasiswa05 mhs = new Mahasiswa05(nim, nama, kelas, ipk);
        return mhs;
    }
    public static void main(String[] args) {
        Scanner paps = new Scanner(System.in);
        DoubleLinkedList05 list = new DoubleLinkedList05();
        int pilihan = 0;

        do {
            System.out.println("MENU DOUBLE LINKED LIST");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("5. Hapus data di awal");
            System.out.println("6. Hapus data di akhir");
            System.out.println("9. Tampilkan data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = paps.nextInt();
            paps.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa05 mhsAwal = inputMahasiswa(paps);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa05 mhsAkhir = inputMahasiswa(paps);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = paps.nextLine();
                    System.out.println("Masukkan data baru:");
                    Mahasiswa05 dataBaru = inputMahasiswa(paps);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);
        paps.close();
    }
}