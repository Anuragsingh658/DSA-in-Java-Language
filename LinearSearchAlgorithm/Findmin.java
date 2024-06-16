public class Findmin {
        public static int min(int[] arr){
            int ans = arr[0];
            for(int i = 1; i<arr.length; i++){
                if(arr[i] < ans){
                    ans = arr[i];
                }
            }
            return ans;
        }
        public static void main(String[] args) {
            int arr[] = {1, 2, 6, 3, 5};
            System.out.println(min(arr));
        }
    }