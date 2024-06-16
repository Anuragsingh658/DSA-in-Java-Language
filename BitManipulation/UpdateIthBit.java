public class UpdateIthBit {
    public static int updateIthbit(int n, int i, int NewBit){
        int Bitmask = NewBit << i;
        return n | Bitmask;
    }
    public static void main(String[] args) {
        System.out.println(updateIthbit(10, 2, 1));
    }
}
