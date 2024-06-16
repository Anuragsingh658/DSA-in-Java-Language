public class ODDorEVEN {
    public static void oddoreven(int n){
        int Bitmask = 1;
        if((n & Bitmask) == 0){
            System.out.println("Number is even");
        }
        else{
            System.err.println("Number is odd");
        }
    }
    public static void main(String[] args) {
        oddoreven(7);
        oddoreven(5);
        oddoreven(4);
        oddoreven(8);
        oddoreven(22);
    }
}
