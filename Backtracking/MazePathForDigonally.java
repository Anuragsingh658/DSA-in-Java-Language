public class MazePathForDigonally {
    public static void main(String[] args) {
        diagonally("", 3, 3);
    }
    static void diagonally(String p, int row, int col){
        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }
        if(row > 1){
            diagonally(p + 'V', row - 1, col);                       //V = Vertical
        }
        if(row > 1 && col > 1){
            diagonally(p + 'D', row - 1, col - 1);             //D = Diagonal
        }
        if(col > 1){
            diagonally(p + 'H', row, col - 1);           //H = horizontal
        }
    }
}