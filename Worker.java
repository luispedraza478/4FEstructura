import java.util.ArrayList;
import java.util.Iterator;

public class Worker {
    int id;
    String nombre;
    int sueldo;
    public Worker(int id, String nombre, int sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Sueldo: " + sueldo;
    }
    public static void main(String[] args) {
        ArrayList<Worker> lista = new ArrayList<Worker>();

        
        lista.add(new Worker(1, "Getsai", 1200));
        lista.add(new Worker(2, "Orlando", 930));
        lista.add(new Worker(3, "Carlos", 1150));
        lista.add(new Worker(4, "Ricardo", 700));
        lista.add(new Worker(5, "Alan", 1700));
        lista.add(new Worker(6, "Alex", 1500));

        
        int suma = 0;
        for (Worker w : lista) {
            suma += w.sueldo;
        }
        double promedio = (double) suma / lista.size();
        System.out.println("Promedio de sueldo: " + promedio);

        
        Iterator<Worker> it = lista.iterator();
        while (it.hasNext()) {
            Worker w = it.next();
            if (w.sueldo < 1000) {
                it.remove();
            }
        }

        
        System.out.println("Lista actualizada:");
        for (Worker w : lista) {
            System.out.println(w);
        }
    }
}
