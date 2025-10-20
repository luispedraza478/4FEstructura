public class App {
    public static void main(String[] args) throws Exception {

        SinglyLinkedList list = new SinglyLinkedList();

        list.add(5);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(9);

        System.out.println("Lista original:");
        list.printList();

        list.removeDuplicates();
        System.out.println("-------------------------------");
        System.out.println("Después de eliminar duplicados:");
        list.printList();

        int ocurrencias = list.countOccurrences(3);
        System.out.println("Ocurrencias de 3: " + ocurrencias);
    }
}
