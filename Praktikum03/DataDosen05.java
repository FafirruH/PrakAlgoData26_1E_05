package Praktikum03;

public class DataDosen05 {

    public void dataSemuaDosen(Dosen05[] arrayOfDosen) {
        System.out.println("\n=== DATA SEMUA DOSEN ===");
        for (Dosen05 d : arrayOfDosen) {
            d.cetakInfo();
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen05[] arrayOfDosen) {
        int pria = 0, wanita = 0;

        for (Dosen05 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("\nJumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }
    
    public void rerataUsiaDosenPerJenisKelamin(Dosen05[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen05 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                countPria++;
            } else {
                totalWanita += d.usia;
                countWanita++;
            }
        }

        System.out.println("\nRata-rata Usia Dosen Pria   : " +
                (countPria > 0 ? (totalPria / countPria) : 0));

        System.out.println("Rata-rata Usia Dosen Wanita : " +
                (countWanita > 0 ? (totalWanita / countWanita) : 0));
    }

    public void infoDosenPalingTua(Dosen05[] arrayOfDosen) {
        Dosen05 tertua = arrayOfDosen[0];

        for (Dosen05 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("\n=== DOSEN PALING TUA ===");
        tertua.cetakInfo();
    }

    public void infoDosenPalingMuda(Dosen05[] arrayOfDosen) {
        Dosen05 termuda = arrayOfDosen[0];

        for (Dosen05 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("\n=== DOSEN PALING MUDA ===");
        termuda.cetakInfo();
    }
}