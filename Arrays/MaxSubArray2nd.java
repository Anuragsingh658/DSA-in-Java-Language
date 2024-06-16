import java.util.*;
public class MaxSubArray2nd {
    public static void Max_SubArray_Sum_2nd(int numbers[]){
        int CurrentSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        //calculate prefix array
        for(int i = 1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }
        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                int end = j;
                CurrentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];                
                if(MaxSum < CurrentSum){
                    MaxSum = CurrentSum;
                }
            }
        }
        System.out.println("Max SUm = " + MaxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        Max_SubArray_Sum_2nd(numbers);
    }
}