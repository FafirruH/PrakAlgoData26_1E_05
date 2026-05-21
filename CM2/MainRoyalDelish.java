package CM2;

import java.util.Scanner;

class NodePembeli {
    int nomorAntrian;
    Pembeli data;
    NodePembeli prev;
    NodePembeli next;

    NodePembeli(NodePembeli prev, int nomorAntrian, Pembeli data, NodePembeli next) {
        this.prev = prev;
        this.nomorAntrian = nomorAntrian;
        this.data = data;
        this.next = next;
    }
}

class NodePesanan {
    Pembeli pembeli;
    Pesanan pesanan;
    NodePesanan prev;
    NodePesanan next;

    NodePesanan(NodePesanan prev, Pembeli pembeli, Pesanan pesanan, NodePesanan next) {
        this.prev = prev;
        this.pembeli = pembeli;
        this.pesanan = pesanan;
        this.next = next;
    }
}

class DoubleLinkedListPembeli {
    NodePembeli head;
    NodePembeli tail;
    int nomor = 1;

    boolean isEmpty() {
        return head == null;
    }

    void tambahAntrian(Pembeli data) {
        NodePembeli newNode = new NodePembeli(null, nomor++, data, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        System.out.println("Antrian berhasil ditambahkan");
    }

    void cetakAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        NodePembeli current = head;

        System.out.println("===================================");
        System.out.println("Daftar Antrian Resto Royal Delish");
        System.out.println("===================================");

        while (current != null) {
            System.out.println("No Antrian : " + current.nomorAntrian);
            System.out.println("Nama       : " + current.data.namaPembeli);
            System.out.println("No HP      : " + current.data.noHp);
            System.out.println("-----------------------------------");
            current = current.next;
        }
    }

    NodePembeli hapusAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }

        NodePembeli temp = head;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        return temp;
    }
}

class DoubleLinkedListPesanan {
    NodePesanan head;
    NodePesanan tail;

    boolean isEmpty() {
        return head == null;
    }

    void tambahPesanan(Pembeli pembeli, Pesanan pesanan) {
        NodePesanan newNode = new NodePesanan(null, pembeli, pesanan, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void sorting() {
        if (isEmpty()) {
            return;
        }

        boolean tukar;

        do {
            tukar = false;
            NodePesanan current = head;

            while (current.next != null) {
                if (current.pesanan.namaPesanan.compareToIgnoreCase(current.next.pesanan.namaPesanan) > 0) {

                    Pesanan tempPesanan = current.pesanan;
                    Pembeli tempPembeli = current.pembeli;

                    current.pesanan = current.next.pesanan;
                    current.pembeli = current.next.pembeli;

                    current.next.pesanan = tempPesanan;
                    current.next.pembeli = tempPembeli;

                    tukar = true;
                }
                current = current.next;
            }
        } while (tukar);
    }

    void laporanPesanan() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan");
            return;
        }

        sorting();

        NodePesanan current = head;
        int total = 0;

        System.out.println("===================================");
        System.out.println("Laporan Pesanan");
        System.out.println("===================================");

        while (current != null) {
            System.out.println("Nama Pembeli : " + current.pembeli.namaPembeli);
            System.out.println("Pesanan      : " + current.pesanan.namaPesanan);
            System.out.println("Harga        : " + current.pesanan.harga);
            System.out.println("-----------------------------------");

            total += current.pesanan.harga;

            current = current.next;
        }

        System.out.println("Total Pendapatan : " + total);
    }
}

public class MainRoyalDelish {
    public static void main(String[] args) {
        Scanner paps = new Scanner(System.in);

        DoubleLinkedListPembeli antrian = new DoubleLinkedListPembeli();
        DoubleLinkedListPesanan daftarPesanan = new DoubleLinkedListPesanan();

        int pilih;

        do {
            System.out.println("===================================");
            System.out.println("   Resto Royal Delish");
            System.out.println("===================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu : ");
            pilih = paps.nextInt();
            paps.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = paps.nextLine();

                    System.out.print("No HP : ");
                    String hp = paps.nextLine();

                    Pembeli pembeli = new Pembeli(nama, hp);
                    antrian.tambahAntrian(pembeli);
                    break;

                case 2:
                    antrian.cetakAntrian();
                    break;

                case 3:
                    NodePembeli dataKeluar = antrian.hapusAntrian();

                    if (dataKeluar != null) {
                        System.out.println("Pembeli dipanggil");
                        System.out.println("No Antrian : " + dataKeluar.nomorAntrian);
                        System.out.println("Nama       : " + dataKeluar.data.namaPembeli);

                        System.out.print("Kode Pesanan : ");
                        int kode = paps.nextInt();
                        paps.nextLine();

                        System.out.print("Nama Pesanan : ");
                        String namaPesanan = paps.nextLine();

                        System.out.print("Harga : ");
                        int harga = paps.nextInt();
                        paps.nextLine();

                        Pesanan pesanan = new Pesanan(kode, namaPesanan, harga);

                        daftarPesanan.tambahPesanan(dataKeluar.data, pesanan);

                        System.out.println("Pesanan berhasil ditambahkan");
                    }
                    break;

                case 4:
                    daftarPesanan.laporanPesanan();
                    break;

                case 5:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak valid");
            }

        } while (pilih != 5);
        paps.close();
    }
}