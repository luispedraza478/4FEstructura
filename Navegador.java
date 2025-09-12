import java.util.Deque;
import java.util.ArrayDeque;

public class Navegador {

    public static void main(String[] args) {
        Deque<String> historial = new ArrayDeque<String>();

        historial.push("https://google.com");
        historial.push("https://youtube.com");
        historial.push("https://netflix.com");

        historial.pop();

        String paginaActual = historial.peek();
        System.out.println("Página actual: " + paginaActual);

        historial.push("https://github.com");

        System.out.println("Historial de navegación:");
        for (String pagina : historial) {
            System.out.println(pagina);
        }
    }
}
