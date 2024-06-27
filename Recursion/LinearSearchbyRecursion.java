import java.sql.Array;
import java.util.ArrayList;

public class LinearSearchbyRecursion {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 23, 23, 12};
        System.out.println(find(arr, 8, 0));
        System.out.println(findIndex(arr, 23, 0));
        System.out.println(findIndexLast(arr, 23, arr.length-1));
        findAllIndex(arr, 23, 0);
        System.out.println(list);
    }
    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

//for finding value at which index
    static int findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return findIndex(arr, target, index+1);
        }
    }

    // for finding value from last index
    static int findIndexLast(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return findIndexLast(arr, target, index-1);
        }
    }

    //finding all index
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }
}
