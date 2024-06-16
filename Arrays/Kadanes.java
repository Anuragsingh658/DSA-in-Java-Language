import java.util.*;
public class Kadanes {
    public static void Kadanes_algorithm(int numbers[]){
        int MaximumSum = Integer.MIN_VALUE;
        int CurrentSum = 0;
        for(int i = 0; i<numbers.length; i++){
            CurrentSum = CurrentSum + numbers[i];
            if(CurrentSum < 0){
                CurrentSum = 0;
            }
            MaximumSum = Math.max(CurrentSum, MaximumSum);
        }
        System.out.println("Our max subarray sum is:" + MaximumSum);
    }
    public static void main(String[] args) {
        int nummbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        Kadanes_algorithm(nummbers);
    }
}
