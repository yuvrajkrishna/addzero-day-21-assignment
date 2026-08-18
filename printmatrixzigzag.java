public class printmatrixzigzag {
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

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                if (i % 2 == 0) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print(arr[i][col - 1 - j] + " ");
                }
            }

            System.out.println();
        }
    }
}