
public class Maximumitem {
    public static void main(String[] args) {
        int[] arr = {23, 4 , 45, 29, 12};
        // System.out.println(max(arr));                                       //it is for find maximum item 
        System.out.println(maxRange(arr, 3, 4));                     //it is for find maximum between index when we are asking to them
    }

    static int maxRange(int[] arr, int start, int end){
        int maxval = start;
        for(int i = start; i<=end; i++){
            if(arr[i]>maxval){
                maxval = arr[i];
            }
        }
        return maxval;


    // static int max(int[] arr){
    //     int maxval = 0;
    //     for(int i = 0; i<arr.length; i++){
    //         if(arr[i]>maxval){
    //             maxval = arr[i];
    //         }
    //     }
    //     return maxval;
    }
}
