public class MazeObsticles {
    public static void main(String[] args) {
        boolean[][] board = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };
        obsticle("", board, 0, 0);
    }
    static void obsticle(String p, boolean[][] maze, int row, int col){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(p);
            return;
        }
        if(maze[row][col] == false){
            return;
        }
        if(row < maze.length - 1){
            obsticle(p + 'D',maze, row + 1, col);
        }
        if(col < maze[0].length - 1){
            obsticle(p + 'R',maze, row, col + 1);
        }
    }
}
