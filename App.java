import java.util.Queue;
import java.util.ArrayDeque;

public class App {
    public static void main(String[] args) {

        Queue<Cliente> cola = new ArrayDeque<>();

        Cliente c1 = new Cliente(1, "Carlos");
        c1.agregarDocumento("Doc1");
        c1.agregarDocumento("Doc2");

        Cliente c2 = new Cliente(2, "María");
        c2.agregarDocumento("Doc1");
        c2.agregarDocumento("Doc2");

        Cliente c3 = new Cliente(3, "José");
        c3.agregarDocumento("Doc1");
        c3.agregarDocumento("Doc2");

        cola.add(c1);
        cola.add(c2);
        cola.add(c3);

        Cliente atendiendo = cola.poll(); 
        if (atendiendo != null) {
            atendiendo.atender();
        }

        System.out.println("Cola restante: " + cola);
    }
}
