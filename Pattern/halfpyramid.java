public class halfpyramid {
    public static void HalfPyramid(int n){
        for(int row=1; row <= n; row++){
            for(int col=1; col <= row; col++){
                System.out.print(col);//col no. will print here
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        HalfPyramid(4);
    }
}
