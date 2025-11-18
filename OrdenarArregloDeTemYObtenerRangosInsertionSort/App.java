import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        double[] temps = {30.5, 28.1, 42.0, 13.5, 17.9, 40.3, 26.0};

        System.out.println("Arreglo original: ");
        System.out.println(Arrays.toString(temps));

        InsertionSort sort = new InsertionSort();
        sort.sort(temps);
        double min = temps[0];
        double max = temps[temps.length - 1];
        double rango = max - min;

        System.out.println("Arreglo ordenado: ");
        System.out.println(Arrays.toString(temps));
        System.out.println("Temperatura mínima: " + min);
        System.out.println("Temperatura máxima: " + max);
        System.out.println("Rango: " + rango);

        System.out.println("Las 3 temperaturas más bajas son: ");
        for (int i = 0; i < 3 && i < temps.length; i++) {
            System.out.println(temps[i]);
        }
            System.out.println("Las 3 temperaturas más altas son: ");
            for (int i = temps.length - 1; i >= 0 && i >= temps.length - 3; i--) {
            System.out.println(temps[i]);
        }
    }
}
