public class Star {
    public static void SimplePattern(int n){
    for(int row=1; row<=n; row++){
        for(int col=1; col <= row; col++){
            System.out.print("*");
        }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        SimplePattern(5);
    }
}
