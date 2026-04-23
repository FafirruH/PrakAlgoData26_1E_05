package Jobsheet09;

import java.util.Scanner;

public class MahasiswaDemo05 {
    public static void main(String[] args) {
        StackTugasMahasiswa05 stack = new StackTugasMahasiswa05(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Terbawah");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Julmlah Tugas");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa05 mhs = new Mahasiswa05(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa05 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.print("Menilai tugas dari: " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100) : ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama,nilai);
                    }
                    break;

                case 3:
                    Mahasiswa05 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + lihat.nama);
                    }
                    break;

                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    System.out.println("Jumlah Tugas Yang Dikumpulkan : "+ stack.JumlahTugas());
                default:
                    System.out.println("Pilihan tidak valid");
            }

        } while (pilih >= 1 && pilih <= 5);
        scan.close();
    }
}