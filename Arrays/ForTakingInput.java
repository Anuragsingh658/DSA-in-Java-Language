import java.util.Arrays;
import java.util.Scanner;

public class ForTakingInput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // int[] arr = new int[10];
        // for(int i = 0; i<arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }
        // // for(int i = 0; i<arr.length; i++){
        // //     System.out.print(arr[i] + " ");
        // // }
        // System.out.println(Arrays.toString(arr));//this is the best way to print all the array element what we will giving in array from user

        String[] str = new String[5];
        for(int i = 0; i<str.length; i++){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[2] = "Anurag Singh";//changing the element of index of 2 then it will show whatever we give input 
        System.out.println(Arrays.toString(str));
    }
}
