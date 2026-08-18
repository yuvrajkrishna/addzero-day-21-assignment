public class printmatrixinreverse{
    public static void main(String[] args) {
        int arr [] [] = {{10,20,30},{40,50,60},{70,80,90},{100,110,120},{130,140,150}};
        int row = arr.length ;
        int col = arr[0].length;
        for(int i = row - 1 ; i >= 0 ; i--){
            for(int j = col - 1 ; j >= 0 ; j--){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}