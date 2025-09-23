import java.util.ArrayList;

public class ListaMaterias {
    ArrayList<String> materias;

    ListaMaterias() {
        materias = new ArrayList<>();
    }

    void agregar(String materia) {
        materias.add(materia);
    }

    boolean contiene(String materia) {
        return materias.contains(materia);
    }

    void imprimir() {
        System.out.println("Materias: " + materias);
    }
}
