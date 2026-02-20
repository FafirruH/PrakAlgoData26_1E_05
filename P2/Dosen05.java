package P2;

public class Dosen05 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung, lama;
    String bidangKeahlian, st;

    public Dosen05() {
    }

    public Dosen05(String idDosen, String nama, boolean statusAktif, 
                 int tahunBergabung, String bidangKeahlian) {
        this.idDosen        = idDosen;
        this.nama           = nama;
        this.statusAktif    = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama Dosen      : " + nama);
        System.out.print("Status          : ");
        if (statusAktif) {
            System.out.println("Aktif");
        } else {
            System.out.println("Nonaktif");
        }
        System.out.println("Tahun Masuk     : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
        if (statusAktif) {
            System.out.println("Status Menjadi Aktif");
        } else {
            System.out.println("Status Menjadi Nonaktif");
        }
    }

    void hitungMasaKerja(int thnSkrg) {
        lama = thnSkrg - tahunBergabung;
        System.out.println("Telah bekerja selama " + lama + " tahun");
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian telah dirubah menjadi : " + bidang);
    }
}
