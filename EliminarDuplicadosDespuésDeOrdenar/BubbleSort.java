public class BubbleSort {

    public void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public int[] quitarDuplicados(int[] arr){
        int cont = 1;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                cont++;
            }
        }

        int[] nuevo = new int[cont];
        nuevo[0] = arr[0];

        int index = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                nuevo[index] = arr[i];
                index++;
            }
        }

        return nuevo;
    }

    public void imprimir(int[] arr){
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if(i < arr.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}