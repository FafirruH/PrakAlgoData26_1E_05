public class BinaryTreeMain05 {
    public static void main(String[] args) {
        BinaryTree05 bat = new BinaryTree05();
        bat.add(new Mahasiswa05("244160121", "Ali", "A", 3.57));
        bat.add(new Mahasiswa05("244160221", "Badar", "B", 3.85));
        bat.add(new Mahasiswa05("244160185", "Candra", "C", 3.21));
        bat.add(new Mahasiswa05("244160220", "Dewi", "B", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in order traversal) : ");
        bat.traverseInOrder(bat.root);

        System.out.println("\nPencarian data mahasiswa: ");
        System.out.println("Cari mahasiswa dengan ipk: 3.54 : ");
        String hasilCari = bat.find(3.54)?"Ditemukan":"Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.println("\nPencarian data mahasiswa: ");
        System.out.println("Cari mahasiswa dengan ipk: 3.22 : ");
        hasilCari = bat.find(3.22)?"Ditemukan":"Tidak ditemukan";
        System.out.println(hasilCari);

        bat.add(new Mahasiswa05("244160131","Devi","A",3.72));
        bat.add(new Mahasiswa05("244160205","Devi","A",3.72));
        bat.add(new Mahasiswa05("244160170","Devi","A",3.72));
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa : ");
        System.out.println("inorder Traversal : ");
        bat.traverseInOrder(bat.root);
        System.out.println("\nPreOrder Traversal : ");
        bat.traversePreOrder(bat.root);
        System.out.println("\nPostOrder Traversal : ");
        bat.traversePostOrder(bat.root);

        System.out.println("\nPenghapusan data mahasiswa");
        bat.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal) : ");
        bat.traverseInOrder(bat.root);
    }
}
