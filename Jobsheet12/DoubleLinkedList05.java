package Jobsheet12;

public class DoubleLinkedList05 {
    Node05 head;
    Node05 tail;
    int size;

    public DoubleLinkedList05() {
        head = null;
        tail = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa05 data) {
        Node05 newNode = new Node05(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        size++;
    }

    public void addLast(Mahasiswa05 data) {
        Node05 newNode = new Node05(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        size++;
    }

    public void insertAfter(String keyNim, Mahasiswa05 data) {
        Node05 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node05 newNode = new Node05(data);

        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }

        size++;

        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void add(int index, Mahasiswa05 data) {
        if (index < 0 || index > size) {
            System.out.println("Index tidak valid");
            return;
        }

        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node05 current = head;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            Node05 newNode = new Node05(data);

            newNode.next = current.next;
            newNode.prev = current;

            current.next.prev = newNode;
            current.next = newNode;

            size++;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        System.out.println("Data " + head.data.nama + " berhasil dihapus");

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        System.out.println("Data " + tail.data.nama + " berhasil dihapus");

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        size--;
    }

    public void removeAfter(String keyNim) {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        Node05 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Node setelah data tidak ditemukan");
            return;
        }

        Node05 removed = current.next;

        if (removed == tail) {
            tail = current;
            current.next = null;
        } else {
            current.next = removed.next;
            removed.next.prev = current;
        }

        size--;

        System.out.println("Data berhasil dihapus");
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid");
            return;
        }

        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node05 current = head;

            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            current.prev.next = current.next;
            current.next.prev = current.prev;

            size--;

            System.out.println("Data berhasil dihapus");
        }
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        } else {
            head.data.tampil();
        }
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        } else {
            tail.data.tampil();
        }
    }

    public void getIndex(int index) {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid");
            return;
        }

        Node05 current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        current.data.tampil();
    }

    public int size() {
        return size;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }

        Node05 current = head;

        while (current != null) {
            current.data.tampil();
            current = current.next;
        }

        System.out.println("Jumlah data : " + size);
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }

        Node05 current = tail;

        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }
}