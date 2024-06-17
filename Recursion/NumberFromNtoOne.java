 
 //print the number from n to 1 in decreasing order 


public class NumberFromNtoOne {         
    public static void NumberDec(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.print(n + " ");
        NumberDec(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        NumberDec(n);
    }
}
