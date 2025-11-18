public class BubbleSort {

    public void sort(int[] arr) {
        int n = arr.length;
        boolean cambio;

        for (int i = 0; i < n - 1; i++) {
            cambio = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    cambio = true;
                }
            }
            if (!cambio) {
                break;
            }
        }
    }
        public void printArray(int[] arr) {
        System.out.print("[ ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("]");
    }
}
