package CM1;
public class Buku05 {
    String kodeBuku;
    String judul;
    int tahunTerbit;
    //konstruktor
    public Buku05(String kode, String judul, int tahun) {
        this.kodeBuku = kode;
        this.judul = judul;
        this.tahunTerbit = tahun;
    }
    //fungsi untuk menampilkan data buku
    public void tampil() {
        System.out.printf("%-10s %-20s %-10d%n", kodeBuku, judul, tahunTerbit);
    }
}