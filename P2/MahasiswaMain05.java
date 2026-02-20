package P2;

public class MahasiswaMain05 {
    public static void main(String[] args) {
        Mahasiswa05 mhs1 = new Mahasiswa05();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nama  = "Muhammad Ali Farhan";
        mhs1.nim   = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk   = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();
        System.out.println(mhs1.nilaiKinerja());

        Mahasiswa05 mhs2 = new Mahasiswa05("Annisa Nabila","2141720160",3.25,"TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa05 mhsFafirru = new Mahasiswa05("Fafirru Hadzami Sycah Mashuri","254107020104",3.60,"TI 1E");
        mhsFafirru.updateIpk(4.00);
        mhsFafirru.tampilkanInformasi();
        System.out.println(mhsFafirru.nilaiKinerja());
    }
}
