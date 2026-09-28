public class Main {

    public static void main(String[] args) {

        LinkedListBarang list = new LinkedListBarang();

        list.insert("Laptop");
        list.insert("Mouse");

        System.out.println("Setelah insert:");
        list.display();

        list.add("Keyboard");
        list.add("Monitor");

        System.out.println("\nSetelah add:");
        list.display();

        System.out.println("\nSearch:");
        list.search("Keyboard");
        list.search("Printer");

        list.delete("Mouse");

        System.out.println("\nSetelah delete Mouse:");
        list.display();
    }
}
