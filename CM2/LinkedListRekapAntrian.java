package CM2;

//linkedlist baru
public class LinkedListRekapAntrian {
    NodeRekap head;
    NodeRekap tail;

    boolean isEmpty() {
        return head == null;
    }
    void tambahRekap(int jam) {
        NodeRekap current = head;
        while (current != null) {
            if (current.jamAntrian == jam) {
                current.jumlah++;
                return;
            }
            current = current.next;
        }
        NodeRekap newNode = new NodeRekap(null, jam, 1, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void tampilRekapTerbanyak() {
        if (isEmpty()) {
            System.out.println("Belum ada rekap antrian");
            return;
        }
        NodeRekap current = head;
        NodeRekap max = head;
        while (current != null) {
            if (current.jumlah > max.jumlah) {
                max = current;
            }
            current = current.next;
        }
        System.out.println("===================================");
        System.out.println("Rekap Jam Antrean Terbanyak");
        System.out.println("===================================");
        System.out.println("Jam    : " + max.jamAntrian);
        System.out.println("Jumlah : " + max.jumlah);
    }
}
