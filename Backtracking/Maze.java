public class Maze {
    public static void main(String[] args) {
        System.out.println(counts(3, 3));;
    }
    static int counts(int row, int col){
        if(row == 1 || col == 1){
            return 1;
        }
        int left = counts(row - 1, col);
        int right = counts(row, col - 1);
        return left + right;
    }
}