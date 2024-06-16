public class Searchinrange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 3;
        System.out.println(linearsearch(arr,target,1,4));
    }
    static int linearsearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        //run a for loop
        for(int index = start; index<=end; index++){
            //check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        //this line will exexcute if none of the return
        //hence the target not found
        return -1;
    }
}
