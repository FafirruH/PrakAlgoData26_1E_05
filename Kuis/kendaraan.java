package Kuis;
//B
public class kendaraan {
    String nomorPlat;
    double jarakTempuh;
    double konsumsiBahanBakar;
    double nilaiEfisiensi;
    
    int jmlhKendaraanEfisien = 0;

    // Konstruktor
    public kendaraan(String nomorPlat, double jarakTempuh, double konsumsiBahanBakar) {
        this.nomorPlat = nomorPlat;
        this.jarakTempuh = jarakTempuh;
        this.konsumsiBahanBakar = konsumsiBahanBakar;
        hitungEfisiensi();
        cekEfisien();
    }

    // Menghitung nilai efisiensi
    void hitungEfisiensi() {
        nilaiEfisiensi = jarakTempuh / konsumsiBahanBakar;
    }

    // Mengecek jumlah kendaraan yang nilai efisennya lebih dari 10
    void cekEfisien() {
        if (nilaiEfisiensi > 10) {
            jmlhKendaraanEfisien++;
        }
    }
    // Cetak data kendaraan
    void printData() {
        System.out.println("Nomor Plat: " + nomorPlat);
        System.out.println("Jarak Tempuh:"+jarakTempuh);
        System.out.println("Konsumsi Bahan Bakar:"+konsumsiBahanBakar);
        System.out.println("Nilai Efisiensi: " + nilaiEfisiensi);
        System.out.println("Jumlah Kendaraan Dengan Nilai Efisiensi > 10 ada " + jmlhKendaraanEfisien);
    }
}