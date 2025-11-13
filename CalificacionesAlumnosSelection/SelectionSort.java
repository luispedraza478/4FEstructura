public class SelectionSort {
    public void sort(String[] nombres, double[] calificaciones) {
        int n = calificaciones.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (calificaciones[j] < calificaciones[min]) {
                    min = j;
                }
            }

             double tempCal = calificaciones[min];
            calificaciones[min] = calificaciones[i];
            calificaciones[i] = tempCal;
            String tempNom = nombres[min];
            nombres[min] = nombres[i];
            nombres[i] = tempNom;
        }
    }
}