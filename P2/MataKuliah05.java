package P2;

public class MataKuliah05 {
    String kodeMK;
    String nama;
    int sks;
    int jumlah;

    MataKuliah05() {
    }

    MataKuliah05(String kodeMK, String nama, int sks, int jumlah) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlah = jumlah;
    }

    void tampilInformasi() {
        System.out.println("Kode MK     : " + kodeMK);
        System.out.println("Nama MK     : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlah);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi " + sks);
    }

    void tambahJam(int jam) {
        jumlah += jam;
        System.out.println("Jumlah jam berhasil ditambah. Total jam sekarang: " + jumlah);
    }

    void kurangiJam(int jam) {
        if (jumlah >= jam) {
            jumlah -= jam;
            System.out.println("Jumlah jam berhasil dikurangi. Total jam sekarang: " + jumlah);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam tidak mencukupi.");
        }
    }
}
