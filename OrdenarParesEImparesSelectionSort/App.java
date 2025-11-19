import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros deseas ingresar?");
        int n = sc.nextInt();

        int[] original = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingresa un numero: ");
            original[i] = sc.nextInt();
        }
        System.out.println("Arreglo original: ");
        System.out.println(Arrays.toString(original));
        int cPares = 0, cImpares = 0;
        for (int i = 0; i < n; i++) {
            if (original[i] % 2 == 0) cPares++;
            else cImpares++;
        }
        int[] pares = new int[cPares];
        int[] impares = new int[cImpares];

        int p = 0, im = 0;
        for (int i = 0; i < n; i++) {
            if (original[i] % 2 == 0) {
                pares[p] = original[i];
                p++;
            } else {
                impares[im] = original[i];
                im++;
            }
        }
        SelectionSort ss = new SelectionSort();
        ss.sort(pares);     
        ss.sort(impares);  

        System.out.println("Los pares ordenados son: ");
        System.out.println(Arrays.toString(pares));
        System.out.println("Los impares ordenados son: ");
        System.out.println(Arrays.toString(impares));
    }
}
