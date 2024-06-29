import java.util.Arrays;

public class bubblesortByRecursion {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubblesort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr, int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){
        if(arr[col] > arr[col + 1]){
            //swap
            int temp = arr[col];
            arr[col] = arr[col + 1];
            arr[col + 1] = temp;
        }
        bubblesort(arr, row, col + 1);
        }else{
            bubblesort(arr, row - 1, 0);
        }
    }
}
