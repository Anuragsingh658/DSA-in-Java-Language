import java.util.*;
public class LargestNum {
    public static int LargestNumber(int numbers[]){
        int largest = Integer.MIN_VALUE; //-infinity
        for(int i = 0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 3, 10};
        System.out.println("Largest value is :" + LargestNumber(numbers));
    }
}