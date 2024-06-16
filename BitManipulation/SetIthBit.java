public class SetIthBit {
    public static int setithbit(int n, int i){
        int Bitmask = 1 << i;
        return n | Bitmask;
    }
    public static void main(String[] args) {
        System.out.println(setithbit(10, 1));
    }
}
