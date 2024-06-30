import java.util.ArrayList;

public class MazePath {
    public static void main(String[] args) {
        path("", 3, 3);
        // System.out.println(pathReturn("", 3, 3));
    }
    static void path(String p, int row, int col){
        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }
        if(row > 1){
            path(p + 'D', row - 1, col);
        }
        if(col > 1){
            path(p + 'R', row, col - 1);
        }
    }


    //it is the 2nd Method to print the path in a manner
    static ArrayList<String> pathReturn(String p, int row, int col){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(row > 1){
            list.addAll(pathReturn(p + 'D', row - 1, col));
        }
        if(col > 1){
            list.addAll( pathReturn(p + 'R', row, col - 1));
        }
        return list;
    }
}
