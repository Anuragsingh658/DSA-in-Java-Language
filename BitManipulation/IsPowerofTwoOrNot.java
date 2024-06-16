public class IsPowerofTwoOrNot {
    public static boolean IsPowerofTwoOrnot(int n){
        return (n&(n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(IsPowerofTwoOrnot(16));
    }
}
