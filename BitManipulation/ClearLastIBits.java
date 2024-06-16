public class ClearLastIBits {
    public static int clearlastIbit(int n, int i){
        int Bitmask = (~0) << i;
        return n & Bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearlastIbit(15, 2));
    }
}
