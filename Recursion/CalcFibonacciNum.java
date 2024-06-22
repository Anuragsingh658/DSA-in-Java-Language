public class CalcFibonacciNum {
    public static int Fib(int n){
        if(n < 2){
            return n;
        }
        return Fib(n - 1) + Fib(n - 2);
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(Fib(n));
    }
}
