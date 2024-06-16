public class Insertion {
    public static void InsertionSort(int arr[]){
        for(int i  = 1; i<arr.length; i++){
            int temp = arr[i];
            int j = i;
            while(j>0 && arr[j-1]>temp){
                arr[j] = arr[j-1];
            j = j-1;
        }
        arr[j] = temp;
        }
    }
    public static void PrintArr(int arr[]) {
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5, 1, 6, 2, 4, 3};
        InsertionSort(arr);
        PrintArr(arr);
    }
}
