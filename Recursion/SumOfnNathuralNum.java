public class SumOfnNathuralNum {
    public static int CalcSum(int n){
        if(n == 1){
            return 1;
        }
        int Snm1 = CalcSum(n-1);                         //Snm1 = Sum(n-1)
        int Sn = n + Snm1;                               //Sum(n)
        return Sn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(CalcSum(n));
    }
}
