package P2Jobsheet10;
public class AntrianKRS05 {
    Mahasiswa05[] data;
    int front;
    int rear;
    int size;
    int max;
    int totalDilayani;  
    int batasPerDPA;    

    public AntrianKRS05(int max, int batasPerDPA) {
        this.max = max;
        this.batasPerDPA = batasPerDPA;
        this.data = new Mahasiswa05[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.totalDilayani = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public boolean isBatasDPATercapai() {
        return totalDilayani >= batasPerDPA;
    }

    public void tambahAntrian(Mahasiswa05 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak dapat menambah mahasiswa.");
            return;
        }
        if (isBatasDPATercapai()) {
            System.out.println("Batas mahasiswa DPA sudah tercapai (" + batasPerDPA + " mahasiswa). Tidak dapat mendaftar.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian KRS.");
    }

    public void panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada mahasiswa yang dipanggil.");
            return;
        }
        if (isBatasDPATercapai()) {
            System.out.println("Batas mahasiswa DPA sudah tercapai. Sesi selesai.");
            return;
        }

        System.out.println("=== Memanggil Antrian untuk Proses KRS ===");
        int dipanggil = 0;
        int jumlahPanggil = Math.min(2, size);

        while (dipanggil < jumlahPanggil && !isEmpty() && !isBatasDPATercapai()) {
            Mahasiswa05 mhs = data[front];
            front = (front + 1) % max;
            size--;
            totalDilayani++;
            dipanggil++;
            System.out.print("Mahasiswa ke-" + totalDilayani + " diproses KRS: ");
            mhs.tampilkanData();
        }

        System.out.println("Total dipanggil sesi ini: " + dipanggil + " mahasiswa.");
        if (isBatasDPATercapai()) {
            System.out.println("INFO: Batas DPA (" + batasPerDPA + " mahasiswa) telah tercapai.");
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Antrian KRS:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkanDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("2 Antrian Terdepan:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        int tampil = Math.min(2, size);
        for (int i = 0; i < tampil; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.print("Mahasiswa paling akhir dalam antrian: ");
        data[rear].tampilkanData();
    }

    public void kosongkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian sudah kosong.");
            return;
        }
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getTotalDilayani() {
        return totalDilayani;
    }

    public int getBelumKRS() {
        return size; 
    }
}