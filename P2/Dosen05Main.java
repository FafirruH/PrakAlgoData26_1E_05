package P2;
public class Dosen05Main {
    public static void main(String[] args) {

        Dosen05 dsn1 = new Dosen05();
        dsn1.idDosen        = "BDS";
        dsn1.nama           = "Budi Santoso";
        dsn1.statusAktif    = true;
        dsn1.tahunBergabung = 2010;
        dsn1.bidangKeahlian = "Jaringan Komputer";

        System.out.println("Data Dosen 1");
        dsn1.tampilInformasi();

        System.out.println("\nMengubah Status");
        dsn1.setStatusAktif(false);

        System.out.println("\nMenghitung Masa Kerja");
        dsn1.hitungMasaKerja(2026);

        System.out.println("\nMengubah Bidang Keahlian");
        dsn1.ubahKeahlian("Keamanan Jaringan");

        System.out.println("\nData Dosen 1 Setelah Diubah");
        dsn1.tampilInformasi();

        Dosen05 dsn2 = new Dosen05("D002", "Siti Rahayu", true, 2015, "Kecerdasan Buatan");

        System.out.println("\nData Dosen 2");
        dsn2.tampilInformasi();

        System.out.println("\nMengubah Status");
        dsn2.setStatusAktif(false);

        System.out.println("\nMenghitung Masa Kerja");
        dsn2.hitungMasaKerja(2026);

        System.out.println("\nMengubah Bidang Keahlian");
        dsn2.ubahKeahlian("Machine Learning");

        System.out.println("\nData Dosen 2 Setelah Diubah");
        dsn2.tampilInformasi();
    }
}