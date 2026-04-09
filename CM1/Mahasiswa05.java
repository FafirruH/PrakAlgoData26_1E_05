package CM1;
public class Mahasiswa05 {
    String nim;
    String nama;
    String prodi;
    //atribut
    public Mahasiswa05(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }
    //fungsi untuk menampilkan data mahasiswa
    public void tampil() {
        System.out.printf("%-10s %-15s %-25s%n", nim, nama, prodi);
    }
}