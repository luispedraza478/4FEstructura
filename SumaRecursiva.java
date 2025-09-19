public class SumaRecursiva {

    public static int suma(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + suma(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("La suma de los 5 primeros " + n + " números naturales es: " + suma(n));
    }
}

