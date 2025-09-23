import java.util.Stack;

public class Cliente {
    int id;
    String nombre;
    Stack<String> documentos;

    Cliente(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        documentos = new Stack<>();
    }

    void agregarDocumento(String doc) {
        documentos.push(doc);
    }

    void atender() {
        System.out.println("Cliente en atención: " + nombre);
        while (!documentos.isEmpty()) {
            System.out.println("Retirando doc: " + documentos.pop());
        }
    }

    @Override
    public String toString() {
        return nombre;
    }
}
