public class MergeSort {
    public static void PrintArr(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergesort(int[] arr, int start, int end){
        if(start >= end){
            return;
        }
        int mid = start + (end - start)/2;        //or (start+end)/2
        mergesort(arr, start, mid);
        mergesort(arr, mid + 1, end);

        merge(arr, start, mid, end);
    }

    //merge method to merge the sorted parts
    public static void merge(int[] arr, int start, int mid, int end){
        int[] temp = new int[end - start+1];
        int i = start;        //index for 1st sorted part
        int j = mid + 1;      //index for 2nd sorted part
        int k = 0;            //index for temp

        while(i <= mid && j <= end){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //for starting elments of 1st sorted part
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= end){
            temp[k++] = arr[j++];
        }

        //for temp to original array
        for(k = 0, i = start; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8, -2};
        mergesort(arr, 0, arr.length-1);
        PrintArr(arr);
    }
}
