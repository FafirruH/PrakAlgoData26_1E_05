package Jobsheet12;

public class DoubleLinkedList05 {
  Node05 head;
  Node05 tail;

  public DoubleLinkedList05() {
    head = null;
    tail = null;
  }

  boolean isEmpty() {
    return (head == null);
  }

  public void addLast(Mahasiswa05 data) {
    Node05 newNode = new Node05(data);
    if (isEmpty()) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
    }
  }

  public void addFirst(Mahasiswa05 input) {
    Node05 newNode = new Node05(input);
    if (isEmpty()) {
      head = newNode;
      tail = newNode;
    } else {
      newNode.next = head;
      head.prev = newNode;
      head = newNode;
    }
  }

  public void insertAfter(String keyNim, Mahasiswa05 data) {
    Node05 current = head;
    while (current != null) {
      if (current != null && current.data.nim.equals(keyNim)) {
        current = current.next;
      }
      if (current == null) {
        System.out.println("Data dengan NIM" + keyNim + "tidak ditemukan");
        return;
      }
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
    System.out.println("Data berhasil disimpan setelah NIM" + keyNim);
  }

  public void print() {
    if (isEmpty()) {
      System.out.println("Linked list kosong");
      return;
    } else {
      Node05 current = head;
      while (current != null) {
        current.data.tampil();
        current = current.next;
      }
    }
  }

  public void removeFirst() {
    Node05 tmp = head;
    if (isEmpty()) {
      System.out.println("Linked list masih Kosong, tidak dapat dihapus!");
    } else if (head == tail) {
      head = tail = null;
      System.out.println("Data berhasil dihapus.");
      tmp.data.tampil();
    } else {
      head = head.next;
      head.prev = null;
      System.out.println("Data berhasil dihapus.");
      tmp.data.tampil();
    }
  }

  public void removeLast() {
    Node05 tmp = tail;
    if (isEmpty()) {
      System.out.println("Linked list masih Kosong, tidak dapat dihapus!");
    } else if (head == tail) {
      head = tail = null;
      System.out.println("Data berhasil dihapus.");
      tmp.data.tampil();
    } else {
      tail = tail.prev;
      tail.next = null;
      System.out.println("Data berhasil dihapus.");
      tmp.data.tampil();
    }
  }

  public void removeAfter(String keyNim) {
    Node05 temp = head;
    Node05 tmp = temp.next;
    do {
      if (temp.data.nim.equals(keyNim) && temp.next != null) {
        if (temp.next.next == null) {
          removeLast();
        } else if (temp.next != null) {
          temp.next = temp.next.next;
          temp.next.prev = temp;
          System.out.println("Data berhasil dihapus.");
          tmp.data.tampil();
        }
        break;
      } else if (temp.data.nim.equals(keyNim) && temp.next == null) {
        System.out.println("Data masih kosong setelah " + keyNim);
        break;
      }
      temp = temp.next;
      tmp = tmp.next;
      if (temp == null) {
        System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan. ");
        return;
      }
    } while (temp != null);
  }

  public void remove(int index) {
    if (index < 0) {
      System.out.println("Indeks salah");
    } else if (index == 1 && index == 0) {
      removeFirst();
    } else {
      Node05 temp = head;
      Node05 tmp = temp;
      for (int i = 0; i < index - 1; i++) {
        temp = temp.next;
        tmp = temp;
      }
      if (temp.next != null) {
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        System.out.println("Data berhasil dihapus.");
        tmp.data.tampil();
      } else {
        removeLast();
      }
    }
  }
}