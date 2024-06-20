public class RightPascalTriangle {
    public static void pattern1(int n){
        for (int row = 0; row <= 2*n ; row++) {
            int TotalRowinCol = row > n ? 2 * n - row : row;//if row is greater than n then ---->2*n-row otherwise or else its equal to row only
            for (int col = 0; col < TotalRowinCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1(4);
    }
}
