public class SerieFibonacci {
    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        int x = 5;
        for (int i = 0; i < x; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
