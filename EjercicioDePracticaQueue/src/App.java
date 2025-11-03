public class App {
    public static void main(String[] args) throws Exception {
        ArrayQueue<Customer> queue = new ArrayQueue<>();
        queue.offer(new Customer(1, "Ana"));
        queue.offer(new Customer(2, "Luis"));
        queue.offer(new Customer(3, "Maya"));
        queue.offer(new Customer(4, "Jose"));
        queue.offer(new Customer(5, "Sofia"));

        System.out.println("Antes de invertir:");
        queue.print();

        int antes = queue.getSize();
        ArrayQueue<Customer> reversed = queue.reverse();

        System.out.println("Después de invertir:");
        reversed.print();

        System.out.println("Elementos antes = " + antes + ", elementos después = " + reversed.getSize());
    }
    static class Customer {
        private int id;
        private String name;

        public Customer(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString() {
            return "Customer{id=" + id + ", name='" + name + "'}";
        }
    }
}
