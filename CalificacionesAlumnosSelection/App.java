import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SelectionSort sorting = new SelectionSort();

        System.out.print("¿Cuántas calificaciones deseas registrar? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] nombres = new String[n];
        double[] calificaciones = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nombre del alumno " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
            System.out.print("Calificación: ");
            calificaciones[i] = sc.nextDouble();
            sc.nextLine();
        }

        sorting.sort(nombres, calificaciones);

        System.out.println("\n--- Calificaciones ordenadas ---");
        for (int i = 0; i < n; i++) {
            System.out.println(calificaciones[i] + " - " + nombres[i]);
        }

        sc.close();
    }
}