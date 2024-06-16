public class ClearBitsInRange {
    public static int clearinrange(int n, int i, int j){
        int a = ((~0) << (j+1));
        int b = (1 << i)-1;
        int Bitmask = a | b;
        return n & Bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearinrange(15, 2, 4));
    }
}
