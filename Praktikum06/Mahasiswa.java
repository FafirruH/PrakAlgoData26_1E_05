package Praktikum06;

public class Mahasiswa {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa(){
    }
    Mahasiswa(String nm,String name,String kls,double ip){
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }
    void tampilInformasi(){
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
        System.out.println("----------------------------------------");
    }
}
