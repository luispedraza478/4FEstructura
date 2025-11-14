public class App {
    public static void main(String[] args) throws Exception {

        int[] arr = {4, 2, 9, 2, 4, 7, 1};

        BubbleSort bs = new BubbleSort();

        System.out.print("Arreglo original: ");
        bs.imprimir(arr);

        bs.bubbleSort(arr);

        System.out.print("Arreglo ordenado: ");
        bs.imprimir(arr);

        int[] sinDuplicados = bs.quitarDuplicados(arr);

        System.out.print("Arreglo sin duplicados: ");
        bs.imprimir(sinDuplicados);
    }
}