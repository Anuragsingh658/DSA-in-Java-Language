import java.util.Arrays;

public class Mutable {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr));
        change(arr);//Method alling
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr){
        arr[2] = 99;
    }
}
