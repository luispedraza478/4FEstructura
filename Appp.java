public class Appp {
    public static void main(String[] args) {

        ListaMaterias lista = new ListaMaterias();

        lista.agregar("Matemáticas");
        lista.agregar("Física");
        lista.agregar("Química");
        lista.agregar("Historia");
        lista.agregar("Programación");

        lista.imprimir();

        String buscar = "Programación";
        System.out.println("Búsqueda: " + buscar);

        if (lista.contiene(buscar)) {
            System.out.println("Resultado: Materia encontrada");
        } else {
            System.out.println("Resultado: Materia no encontrada");
        }
    }
}
