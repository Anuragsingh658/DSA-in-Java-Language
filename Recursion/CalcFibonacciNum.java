public class CalcFibonacciNum {
    public static int Fibn(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fnm1 = Fibn(n-1);
        int fnm2 = Fibn(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Fibn(n));
    }
}
