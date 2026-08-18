public class printmaxfromallrow {
    public static void main(String[] args) {
        int arr[][] = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90},
            {100, 110, 120},
            {130, 140, 150}
        };
        for(int i = 0 ; i < arr.length ; i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0 ; j < arr[0].length ; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
            System.out.println("For "+(i+1)+"st row Max : "+max);
        }
    }
}
