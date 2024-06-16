import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] arr = {23, 24, 56, 12, 45, 67};
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Reverse(int[] arr){
        int first = 0;
        int end = arr.length - 1;
        while(first < end){
            swap(arr, first, end);
            first++;
            end--;
        }
    }
    static void swap(int[] arr, int first, int end){
        int temp = arr[first];
            arr[first] = arr[end];
            arr[end] = temp;
    }
}    

