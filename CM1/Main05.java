package CM1;

import java.util.Scanner;

public class Main05 {
    //declare scanner untuk input
    static Scanner input = new Scanner(System.in);
    //hardcode data mahasiswa
    static Mahasiswa05[] mhs = {
            new Mahasiswa05("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa05("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa05("22003", "Citra", "Sistem Informasi Bisnis")
    };
    //hardcode data buku
    static Buku05[] buku = {
            new Buku05("B001", "Algoritma", 2020),
            new Buku05("B002", "Basis Data", 2019),
            new Buku05("B003", "Pemrograman", 2021),
            new Buku05("B004", "Fisika", 2024)
    };
    //hardcode data peminjaman
    static Peminjaman05[] pinjam = {
            new Peminjaman05(mhs[0], buku[0], 7),
            new Peminjaman05(mhs[1], buku[1], 3),
            new Peminjaman05(mhs[2], buku[2], 10),
            new Peminjaman05(mhs[2], buku[3], 6),
            new Peminjaman05(mhs[0], buku[1], 4)
    };
    //fungsi main
    public static void main(String[] args) {
        int pilih;
        do {
            menu();
            pilih = input.nextInt();

            switch (pilih) {
                case 1 -> tampilMahasiswa();
                case 2 -> tampilBuku();
                case 3 -> tampilPeminjaman();
                case 4 -> sortingDenda();
                case 5 -> cariNIM();
                case 0 -> System.out.println("Program selesai.");
                default -> System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 0);
    }
    //fungsi menu
    static void menu() {
        System.out.println("\n=== SISTEM PEMINJAMAN BUKU ===");
        System.out.println("1. Tampilkan Mahasiswa");
        System.out.println("2. Tampilkan Buku");
        System.out.println("3. Tampilkan Peminjaman");
        System.out.println("4. Urutkan Berdasarkan Denda");
        System.out.println("5. Cari Berdasarkan NIM");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
    }
    //fungsi untuk menampilkan data mahasiswa
    static void tampilMahasiswa() {
        System.out.println("\n=== DATA MAHASISHA ===");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-10s %-15s %-25s%n", "NIM", "Nama", "Prodi");
        System.out.println("--------------------------------------------------");

        for (Mahasiswa05 m : mhs) {
            System.out.printf("%-10s %-15s %-25s%n", m.nim, m.nama, m.prodi);
        }

        System.out.println("--------------------------------------------------");
    }
    //fungsi untuk menampilkan data buku
    static void tampilBuku() {
        System.out.println("\n=== DATA BUKU ===");
        System.out.println("-------------------------------------");
        System.out.printf("%-10s %-20s %-10s%n", "Kode", "Judul", "Tahun");
        System.out.println("-------------------------------------");

        for (Buku05 b : buku) {
            System.out.printf("%-10s %-20s %-10d%n", b.kodeBuku, b.judul, b.tahunTerbit);
        }

        System.out.println("-------------------------------------");
    }
    //fungsi untuk menampilkan data peminjaman
    static void tampilPeminjaman() {
        System.out.println("\n=== DATA PEMINJAMAN ===");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-20s %-10s %-12s %-10s%n",
                "NIM", "Nama", "Judul", "Lama", "Terlambat", "Denda");
        System.out.println("--------------------------------------------------------------------------------");

        for (Peminjaman05 p : pinjam) {
            System.out.printf("%-10s %-15s %-20s %-10d %-12d Rp%,d%n",
                    p.mhs.nim, p.mhs.nama, p.buku.judul,
                    p.lamaPinjam, p.terlambat, p.denda);
        }

        System.out.println("--------------------------------------------------------------------------------");
    }
    //fungsi untuk mengurutkan denda dengan insertion sort
    static void sortingDenda() {
        for (int i = 1; i < pinjam.length; i++) {
            Peminjaman05 key = pinjam[i];
            int j = i - 1;

            while (j >= 0 && pinjam[j].denda < key.denda) {
                pinjam[j + 1] = pinjam[j];
                j--;
            }
            pinjam[j + 1] = key;
        }

        System.out.println("\n=== DATA PEMINJAMAN (URUT DENDA TERBESAR) ===");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-20s %-10s %-12s %-10s%n",
                "NIM", "Nama", "Judul", "Lama", "Terlambat", "Denda");
        System.out.println("--------------------------------------------------------------------------------");

        for (Peminjaman05 p : pinjam) {
            System.out.printf("%-10s %-15s %-20s %-10d %-12d Rp%,d%n",
                    p.mhs.nim, p.mhs.nama, p.buku.judul,
                    p.lamaPinjam, p.terlambat, p.denda);
        }

        System.out.println("--------------------------------------------------------------------------------");
    }
    //fungsi untuk mencari data mahasiswa menggunakan nim
    static void cariNIM() {
        input.nextLine();
        System.out.print("\nMasukkan NIM: ");
        String cari = input.nextLine();

        boolean ketemu = false;

        System.out.println("\n=== HASIL PENCARIAN ===");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-20s %-10s %-12s %-10s%n",
                "NIM", "Nama", "Judul", "Lama", "Terlambat", "Denda");
        System.out.println("---------------------------------------------------------------------------------------");

        for (Peminjaman05 p : pinjam) {
            if (p.mhs.nim.equals(cari)) {
                System.out.printf("%-10s %-15s %-20s %-10d %-12d Rp%,d%n",
                        p.mhs.nim, p.mhs.nama, p.buku.judul,
                        p.lamaPinjam, p.terlambat, p.denda);
                ketemu = true;
            }
        }

        if (!ketemu) {
            System.out.println("Data tidak ditemukan.");
        }

        System.out.println("---------------------------------------------------------------------------------------");
    }
}