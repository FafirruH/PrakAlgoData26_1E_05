package Jobsheet09;

public class Mahasiswa05 {
    String nama;
    String nim;
    String kelas;
    int nilai;

    Mahasiswa05(String nim, String nama, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}