package Jobsheet12;

import java.util.Scanner;

public class DoubleLinkedListMain05 {
    static Scanner paps = new Scanner(System.in);

    static Mahasiswa05 inputMahasiswa(Scanner paps) {
        System.out.print("Masukkan NIM   : ");
        String nim = paps.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = paps.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = paps.nextLine();
        System.out.print("Masukkab IPK   : ");
        String dummy = paps.nextLine();
        double ipk = Double.parseDouble(dummy);
        Mahasiswa05 mhs = new Mahasiswa05(nim, nama, kelas, ipk);
        return mhs;
    }

    public static void main(String[] args) {
        DoubleLinkedList05 list = new DoubleLinkedList05();
        int pilihan = 0;

        do {
            System.out.println("MENU DOUBLE LINKED LIST");
            System.out.println("1. Add First");
            System.out.println("2. Add Last");
            System.out.println("3. Insert After");
            System.out.println("4. Add Index");
            System.out.println("5. Remove First");
            System.out.println("6. Remove Last");
            System.out.println("7. Remove After");
            System.out.println("8. Remove Index");
            System.out.println("9. Print");
            System.out.println("10. Print Reverse");
            System.out.println("11. Get First");
            System.out.println("12. Get Last");
            System.out.println("13. Get Index");
            System.out.println("14. Size");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = paps.nextInt();
            paps.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim1 = paps.nextLine();
                    System.out.print("Nama  : ");
                    String nama1 = paps.nextLine();
                    System.out.print("Kelas : ");
                    String kelas1 = paps.nextLine();
                    System.out.print("IPK   : ");
                    double ipk1 = paps.nextDouble();
                    paps.nextLine();

                    Mahasiswa05 m1 = new Mahasiswa05(nim1, nama1, kelas1, ipk1);
                    list.addFirst(m1);
                    break;

                case 2:
                    System.out.print("NIM   : ");
                    String nim2 = paps.nextLine();
                    System.out.print("Nama  : ");
                    String nama2 = paps.nextLine();
                    System.out.print("Kelas : ");
                    String kelas2 = paps.nextLine();
                    System.out.print("IPK   : ");
                    double ipk2 = paps.nextDouble();
                    paps.nextLine();

                    Mahasiswa05 m2 = new Mahasiswa05(nim2, nama2, kelas2, ipk2);
                    list.addLast(m2);
                    break;

                case 3:
                    System.out.print("Masukkan NIM acuan : ");
                    String keyNim = paps.nextLine();

                    System.out.print("NIM   : ");
                    String nim3 = paps.nextLine();
                    System.out.print("Nama  : ");
                    String nama3 = paps.nextLine();
                    System.out.print("Kelas : ");
                    String kelas3 = paps.nextLine();
                    System.out.print("IPK   : ");
                    double ipk3 = paps.nextDouble();
                    paps.nextLine();

                    Mahasiswa05 m3 = new Mahasiswa05(nim3, nama3, kelas3, ipk3);
                    list.insertAfter(keyNim, m3);
                    break;

                case 4:
                    System.out.print("Masukkan index : ");
                    int indexAdd = paps.nextInt();
                    paps.nextLine();

                    System.out.print("NIM   : ");
                    String nim4 = paps.nextLine();
                    System.out.print("Nama  : ");
                    String nama4 = paps.nextLine();
                    System.out.print("Kelas : ");
                    String kelas4 = paps.nextLine();
                    System.out.print("IPK   : ");
                    double ipk4 = paps.nextDouble();
                    paps.nextLine();

                    Mahasiswa05 m4 = new Mahasiswa05(nim4, nama4, kelas4, ipk4);
                    list.add(indexAdd, m4);
                    break;

                case 5:
                    list.removeFirst();
                    break;

                case 6:
                    list.removeLast();
                    break;

                case 7:
                    System.out.print("Masukkan NIM acuan : ");
                    String keyRemove = paps.nextLine();
                    list.removeAfter(keyRemove);
                    break;

                case 8:
                    System.out.print("Masukkan index : ");
                    int indexRemove = paps.nextInt();
                    paps.nextLine();
                    list.remove(indexRemove);
                    break;

                case 9:
                    list.print();
                    break;

                case 10:
                    list.printReverse();
                    break;

                case 11:
                    list.getFirst();
                    break;

                case 12:
                    list.getLast();
                    break;

                case 13:
                    System.out.print("Masukkan index : ");
                    int indexGet = paps.nextInt();
                    paps.nextLine();
                    list.getIndex(indexGet);
                    break;

                case 14:
                    System.out.println("Jumlah data : " + list.size());
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);
        paps.close();
    }
}