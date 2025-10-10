public class App {
    public static void main(String[] args) throws Exception {
        int[][] arrTest = {
            {1},
            {6, 3, 1},
            {1, 2, 3, 4},
            {0, 5, 3, 0},
            {2, 5, 9},
            {2, 4, 8, 9, 10}
        };

        int[][] arrBiE = new int[6][];
        arrBiE[0] = new int[]{1, 2};
        arrBiE[1] = new int[]{6, 3, 1, 2};
        arrBiE[2] = new int[]{1, 2, 3, 4, 5};
        arrBiE[3] = new int[]{0, 5, 3, 0, 1};
        arrBiE[4] = new int[]{2, 5, 9, 10};
        arrBiE[5] = new int[]{2, 4, 8, 9, 10, 11};

        for (int i = 0; i < arrBiE.length; i++) {
            for (int j = 0; j < arrBiE[i].length; j++) {
                System.out.print(arrBiE[i][j] + " ");
            }
            System.out.println();
        }
    }
}
