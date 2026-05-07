package Pertemuan12;

public class QueueLinkedList {
    Node05 front, rear;
    int size;
    int max = 10;

    boolean isEmpty() {
        return front == null;
    }

    boolean isFull() {
        return size == max;
    }

    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }

    void enqueue(Mahasiswa05 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }

        Node05 newNode = new Node05(mhs, null);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
        System.out.println("Mahasiswa berhasil masuk antrian");
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("Mahasiswa dipanggil:");
        front.data.tampilInformasi();

        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }
    }

    void tampilFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian terdepan:");
            front.data.tampilInformasi();
        }
    }

    void tampilRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian paling belakang:");
            rear.data.tampilInformasi();
        }
    }

    void tampilJumlah() {
        System.out.println("Jumlah mahasiswa mengantre: " + size);
    }

    void tampilSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        Node05 temp = front;

        System.out.println("Daftar Antrian:");
        while (temp != null) {
            temp.data.tampilInformasi();
            System.out.println("---------------------------");
            temp = temp.next;
        }
    }
}