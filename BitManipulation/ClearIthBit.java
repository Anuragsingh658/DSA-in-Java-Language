public class ClearIthBit {
    public static int clearIthbit(int n, int i){
        int Bitmask = ~(1 << i);
        return n & Bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearIthbit(10, 1));
    }
}
