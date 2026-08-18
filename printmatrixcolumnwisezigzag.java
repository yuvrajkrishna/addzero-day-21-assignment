public class printmatrixcolumnwisezigzag {

    public static void main(String[] args) {

        int arr[][] = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90},
            {100, 110, 120},
            {130, 140, 150}
        };

        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < col; i++) {

            for (int j = 0; j < row; j++) {

                if (i % 2 == 0) {
                    System.out.print(arr[j][i] + " ");
                } else {
                    System.out.print(arr[row - 1 - j][i] + " ");
                }
            }

            System.out.println();
        }
    }
}