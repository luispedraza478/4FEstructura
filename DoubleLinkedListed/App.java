public class App {
    public static void main(String[] args) throws Exception {
        
        DoublelinkedList list = new DoublelinkedList();
        list.printForward();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("Lista original:");
        list.printForward();

        System.out.println("---imprimir backward---");
        list.printBackward();

        System.out.println("---eliminando elementos----");
        list.remove(1); 
        list.remove(4);
        list.remove(6); 

        System.out.println("Lista después de eliminar:");
        list.printForward();
        System.out.println("---imprimir backward----");
        list.printBackward();
    }
}
