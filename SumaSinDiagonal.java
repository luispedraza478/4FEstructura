public class SumaSinDiagonal {
    public static void main(String[] args) {
        int[][] arrTest = {
            {1, 3, 7, 8},
            {0, 6, 3, 1},
            {1, 2, 3, 4},
            {0, 5, 3, 0},
            {2, 5, 9, 0}
        };

        int suma = 0;

        for (int i = 0; i < arrTest.length; i++) {
            for (int j = 0; j < arrTest[i].length; j++) {
                if (i != j) {
                    suma += arrTest[i][j];
                }
            }
        }

        System.out.println("La suma sin la diagonal principal es: " + suma);
    }
}
