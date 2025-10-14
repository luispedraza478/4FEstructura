public class App {
    public static void main(String[] args) {

        int[][] datos = {
            {1},
            {6, 3, 1},
            {1, 2, 3, 4},
            {0, 5, 3, 0},
            {2, 5, 9},
            {2, 4, 8, 9, 10}
        };

        System.out.println("Datos Originles");
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.print(" " + datos[i][j]);
            }
            System.out.println();
        }

        int[][] datosNuevos = new int[datos.length][];

        for (int fila = 0; fila < datos.length; fila++) {
            int tamaño = datos[fila].length + 1;
            datosNuevos[fila] = new int[tamaño];

            for (int col = 0; col < datos[fila].length; col++) {
                datosNuevos[fila][col] = datos[fila][col];
            }

            if (datos[fila].length % 2 == 0) {
                int suma = datos[fila][0] + datos[fila][datos[fila].length - 1];
                datosNuevos[fila][tamaño - 1] = suma;
            } else {
                datosNuevos[fila][tamaño - 1] = 0;
            }
        }

        System.out.println("Datos Finales");
        for (int i = 0; i < datosNuevos.length; i++) {
            for (int j = 0; j < datosNuevos[i].length; j++) {
                System.out.print(" " + datosNuevos[i][j]);
            }
            System.out.println();
        }
    }
}
