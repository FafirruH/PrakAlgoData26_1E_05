import java.util.Scanner;

public class tugas2 {
    static Scanner faf = new Scanner(System.in);
    static String[][] jadwal;
    static int n = 0;

    public static void inputJadwal() {
        System.out.print("Masukkan jumlah jadwal: ");
        n = Integer.parseInt(faf.nextLine());
        jadwal = new String[n][4];

        for (int i = 0; i < n; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = faf.nextLine();
            System.out.print("Ruang            : ");
            jadwal[i][1] = faf.nextLine();
            System.out.print("Hari             : ");
            jadwal[i][2] = faf.nextLine();
            System.out.print("Jam              : ");
            jadwal[i][3] = faf.nextLine();
        }
    }

    public static void tampilSemua() {
        if (n == 0) {
            System.out.println("Data jadwal masih kosong!");
            return;
        }

        System.out.println("\n=== DAFTAR JADWAL KULIAH ===");
        System.out.println("==============================================================");
        System.out.printf("%-25s %-15s %-10s %-10s\n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("==============================================================");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-15s %-10s %-10s\n",
                    jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
        System.out.println("==============================================================");
    }

    public static void cariHari() {
        if (n == 0) {
            System.out.println("Data jadwal masih kosong!");
            return;
        }

        System.out.print("Masukkan hari yang dicari: ");
        String hariCari = faf.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hariCari)) {
                System.out.println(jadwal[i][0] + " | " +
                                   jadwal[i][1] + " | " +
                                   jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada hari tersebut.");
        }
    }

    public static void cariMatkul() {
        if (n == 0) {
            System.out.println("Data jadwal masih kosong!");
            return;
        }

        System.out.print("Masukkan nama mata kuliah: ");
        String mkCari = faf.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mkCari)) {
                System.out.println("Ruang : " + jadwal[i][1]);
                System.out.println("Hari  : " + jadwal[i][2]);
                System.out.println("Jam   : " + jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n===== MENU JADWAL KULIAH =====");
            System.out.println("1. Input Jadwal Kuliah");
            System.out.println("2. Tampilkan Semua Jadwal");
            System.out.println("3. Cari Jadwal Berdasarkan Hari");
            System.out.println("4. Cari Jadwal Berdasarkan Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu [1-5]: ");
            pilihan = Integer.parseInt(faf.nextLine());

            switch (pilihan) {
                case 1:
                    inputJadwal();
                    break;
                case 2:
                    tampilSemua();
                    break;
                case 3:
                    cariHari();
                    break;
                case 4:
                    cariMatkul();
                    break;
                case 5:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 5);
    }
}
