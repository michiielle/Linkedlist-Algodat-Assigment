public class Main {

    public static void main(String[] args) {

        LinkedListBarang list = new LinkedListBarang();

        System.out.println("Sebelum insert:");
        list.display();

        if (list.head != null) {
            System.out.println("Head: " + list.head.nama);
            System.out.println("Tail: " + list.tail.nama);
        } else {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        }

        list.insert("Laptop");

        System.out.println("\nSetelah insert Laptop:");
        list.display();
        System.out.println("Head: " + list.head.nama);
        System.out.println("Tail: " + list.tail.nama);


        list.insert("Mouse");

        System.out.println("\nSetelah insert Mouse:");
        list.display();
        System.out.println("Head: " + list.head.nama);
        System.out.println("Tail: " + list.tail.nama);


        System.out.println("\nSebelum add Keyboard:");
        list.display();
        System.out.println("Head: " + list.head.nama);
        System.out.println("Tail: " + list.tail.nama);

        list.add("Keyboard");

        System.out.println("\nSetelah add Keyboard:");
        list.display();
        System.out.println("Head: " + list.head.nama);
        System.out.println("Tail: " + list.tail.nama);


        list.add("Monitor");

        System.out.println("\nSetelah add Monitor:");
        list.display();
        System.out.println("Head: " + list.head.nama);
        System.out.println("Tail: " + list.tail.nama);


        System.out.println("\nSearch:");
        list.search("Keyboard");
        list.search("Printer");


        System.out.println("\nSebelum delete Mouse:");
        list.display();
        System.out.println("Head: " + list.head.nama);
        System.out.println("Tail: " + list.tail.nama);

        list.delete("Mouse");

        System.out.println("\nSetelah delete Mouse:");
        list.display();
        System.out.println("Head: " + list.head.nama);
        System.out.println("Tail: " + list.tail.nama);
    }
}