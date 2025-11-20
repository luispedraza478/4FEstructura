import java.util.Random;

public class App {
    public static void main(String[] args) {

        int[][] matriz = new int[4][4];
        Random rand = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rand.nextInt(100);
            }
        }
        System.out.println("Matriz antes de ordenar:");
        int[][] miArreglo = matriz;
        for (int i = 0; i < miArreglo.length; i++) { // Recorre las filas
            for (int j = 0; j < miArreglo[i].length; j++) { // Recorre las columnas de la fila actual
                System.out.print(miArreglo[i][j] + " ");
            }
            System.out.println(); // Nueva línea después de cada fila
        }

        BubbleSort bs = new BubbleSort();
        for (int i = 0; i < matriz.length; i++) {
            bs.sort(matriz[i]);
        }
        System.out.println("\nMatriz después de ordenar:");
        for (int i = 0; i < miArreglo.length; i++) 
            { 
            for (int j = 0; j < miArreglo[i].length; j++) 
                { 
                System.out.print(miArreglo[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
