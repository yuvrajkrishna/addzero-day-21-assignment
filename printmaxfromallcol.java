public class printmaxfromallcol{
    public static void main(String[] args) {
        int arr[][] = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90},
            {100, 110, 120},
            {130, 140, 150}
        };
        for(int i = 0 ; i < arr[0].length ; i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0 ; j< arr.length ; j++){
                if(arr[j][i] > max){
                    max = arr[j][i];
                }
            }
            System.out.println("For "+(i+1)+"st row Max : "+max);
        }
    }
}