package CM1;

public class Buku05 {
    String kodeBuku;
    String judul;
    int tahunTerbit;
    String grade; // atribut baru

    // konstruktor (Modifikasi menambahkan grade)
    public Buku05(String kode, String judul, int tahun, String grade) {
        this.kodeBuku = kode;
        this.judul = judul;
        this.tahunTerbit = tahun;
        this.grade = grade;
    }

    // tampil data (Modifikasi menambahkan grade)
    public void tampil() {
        System.out.printf("%-10s %-20s %-10d %-10s%n",
                kodeBuku, judul, tahunTerbit, grade);
    }
}