package CM1;

public class Peminjaman05 {
    Mahasiswa05 mhs;
    Buku05 buku;
    int lamaPinjam;
    int terlambat;
    int denda;
    //atribut
    public Peminjaman05(Mahasiswa05 mhs, Buku05 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }
    //fungsi untuk menghitung denda
    public void hitungDenda() {
        if (lamaPinjam > 5) {
            terlambat = lamaPinjam - 5;
            denda = terlambat * 2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }
    //fungsi untuk menampilkan data peminjaman
    public void tampil() {
        System.out.printf("%-8s %-12s %-18s %-10d%n",
                mhs.nim, mhs.nama, buku.judul, lamaPinjam);
    }
    //fungsi untuk menampilkan denda
    public void tampilDenda() {
        System.out.printf("%-8s %-12s %-18s %-10d %-10d Rp%,d%n",
                mhs.nim, mhs.nama, buku.judul,
                lamaPinjam, terlambat, denda);
    }
}