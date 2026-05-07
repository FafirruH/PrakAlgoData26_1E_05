package Pertemuan12;

import java.util.Scanner;

public class SLLMain05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // SingleLinkedList05 sll = new SingleLinkedList05();
        // System.out.print("Masukkan jumlah data: ");
        // int jumlah = sc.nextInt();
        // sc.nextLine();

        // for (int i = 0; i < jumlah; i++) {
        // System.out.println("Data Mahasiswa ke-" + (i + 1));

        // System.out.print("Nama : ");
        // String nama = sc.nextLine();

        // System.out.print("NIM : ");
        // String nim = sc.nextLine();

        // System.out.print("Kelas: ");
        // String kelas = sc.nextLine();

        // System.out.print("IPK : ");
        // double ipk = sc.nextDouble();
        // sc.nextLine();

        // Mahasiswa05 mhs = new Mahasiswa05(nim, nama, kelas, ipk);

        // sll.addLast(mhs);
        // System.out.println();
        // }

        // System.out.println("Isi Linked List");
        // sll.print();
        SingleLinkedList05 sll = new SingleLinkedList05();
        Mahasiswa05 mhs1 = new Mahasiswa05("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa05 mhs2 = new Mahasiswa05("23212201", "Bimon", "2B", 3.8);
        Mahasiswa05 mhs3 = new Mahasiswa05("22212202", "Cimon", "3C", 3.5);
        Mahasiswa05 mhs4 = new Mahasiswa05("21212203", "Dirga", "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.print();
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("data index1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : "+sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

        sc.close();
    }
}