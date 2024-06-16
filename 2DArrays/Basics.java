import java.util.Arrays;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[][] arr = new int[3][2];
        System.out.println(arr.length);//it will print the no. of rows

        for(int row = 0; row<arr.length; row++){
            //for each row in every coloumn
            for(int col = 0; col<arr[row].length; col++){             //arr[row].lenght is showing the no. of coloumns
                arr[row][col] = sc.nextInt();
            }
        }
        // for output = method 1st
        // for(int row = 0; row<arr.length; row++){
        //     //for each row in every coloumn
        //     for(int col = 0; col<arr[row].length; col++){           //arr[row].lenght is showing the no. of coloumns
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }

    //for output= Method 2nd
        // for(int row = 0; row<arr.length; row++){
        // System.out.println(Arrays.toString(arr[row]));
        // }

        // for output =method 3rd or enhanced for loop
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
