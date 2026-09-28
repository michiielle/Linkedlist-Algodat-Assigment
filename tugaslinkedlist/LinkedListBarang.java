
public class LinkedListBarang {

    class NodeBarang {
        String nama;
        NodeBarang next;

        public NodeBarang(String nama) {
            this.nama = nama;
            this.next = null;
        }

        public void checkData() {
            System.out.println(nama);
        }
    }

    NodeBarang head = null;
    NodeBarang tail = null;

    public void insert(String nama) {

        NodeBarang newNode = new NodeBarang(nama);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void add(String nama) {

        NodeBarang newNode = new NodeBarang(nama);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void delete(String nama) {

        if (head == null) {
            return;
        }

        if (head.nama.equals(nama)) {
            head = head.next;

            if (head == null) {
                tail = null;
            }

            return;
        }

        NodeBarang current = head;

        while (current.next != null) {

            if (current.next.nama.equals(nama)) {

                if (current.next == tail) {
                    tail = current;
                }

                current.next = current.next.next;
                return;
            }

            current = current.next;
        }
    }

    public void search(String nama) {

        NodeBarang current = head;

        while (current != null) {

            if (current.nama.equals(nama)) {
                System.out.println(nama + " ditemukan!");
                return;
            }

            current = current.next;
        }

        System.out.println(nama + " tidak ditemukan.");
    }

    public void display() {

        NodeBarang current = head;

        while (current != null) {
            System.out.print(current.nama + " -> ");
            current = current.next;
        }

        System.out.println("NULL");
    }
}
