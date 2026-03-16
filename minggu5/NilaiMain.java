package minggu5;
public class NilaiMain {
    public static int maxUTSDC(Nilai[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        } else {
            int mid = (l + r) / 2;
            int lmax = maxUTSDC(arr, l, mid);
            int rmax = maxUTSDC(arr, mid + 1, r);
            return Math.max(lmax, rmax);
        }
    }
    public static int minUTSDC(Nilai[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        } else {
            int mid = (l + r) / 2;
            int lmin = minUTSDC(arr, l, mid);
            int rmin = minUTSDC(arr, mid + 1, r);
            return Math.min(lmin, rmin);
        }
    }
    public static double rataUASBF(Nilai[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].nilaiUAS; 
        }
        return total / arr.length;
    }
    public static void main(String[] args) {
        Nilai[] mhs = new Nilai[8];
        mhs[0] = new Nilai("Ahmad", "220101001", 2022, 78, 82);
        mhs[1] = new Nilai("Budi", "220101002", 2022, 85, 88);
        mhs[2] = new Nilai("Cindy", "220101003", 2021, 90, 87);
        mhs[3] = new Nilai("Dian", "220101004", 2021, 76, 79);
        mhs[4] = new Nilai("Eko", "220101005", 2023, 92, 95);
        mhs[5] = new Nilai("Fajar", "220101006", 2020, 88, 85);
        mhs[6] = new Nilai("Gina", "220101007", 2023, 80, 83);
        mhs[7] = new Nilai("Hadi", "220101008", 2020, 82, 84);
        System.out.println("=== HASIL PERHITUNGAN ===");
        int tertinggiUTS = maxUTSDC(mhs, 0, mhs.length - 1);
        System.out.println("a) Nilai UTS tertinggi (Divide Conquer) : " + tertinggiUTS);
        int terendahUTS = minUTSDC(mhs, 0, mhs.length - 1);
        System.out.println("b) Nilai UTS terendah (Divide Conquer)  : " + terendahUTS);
        double rataUAS = rataUASBF(mhs);
        System.out.println("c) Rata-rata nilai UAS (Brute Force)    : " + rataUAS);
    }
}