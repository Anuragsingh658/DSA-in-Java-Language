
//print the number from 1 to N in increasing order 

public class IncreasingNumberOnetoN {
    public static void NumberInc(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        NumberInc(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n = 10;
        NumberInc(n);
    }
}
