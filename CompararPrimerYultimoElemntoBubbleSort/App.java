import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos números tendrá el arreglo?: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Ingresa los " + n + " números:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] original = new int[n];
        for (int i = 0; i < n; i++) {
            original[i] = arr[i];
        }
        BubbleSort bubble = new BubbleSort();
        bubble.sort(arr);

        int minimo = arr[0];
        int maximo = arr[arr.length - 1];
        int diferencia = maximo - minimo;

            System.out.println("\nArreglo original:");
            bubble.printArray(original);

            System.out.println("Arreglo ordenado:");
            bubble.printArray(arr);

            System.out.println("Valor mínimo: " + minimo);
            System.out.println("Valor máximo: " + maximo);
            System.out.println("Diferencia: " + diferencia);
    }
}
