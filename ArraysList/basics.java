import java.util.ArrayList;
import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

        // list.add(23);                                     //for intialization
        // list.add(22);
        // list.add(28);
        // list.add(25);
        // list.add(20);

        // System.out.println(list.contains(345));           //it will show false because this element is not in this list which we are mentioned
        // System.out.println(list);

        // list.set(1, 34);                                  //with this help we can change any element from any index
        // System.out.println(list);

        // list.remove(2);                                  //with this help we can remove any element from any index
        // System.out.println(list);

        //for taking input
        for(int i = 0; i<5; i++){
            list.add(sc.nextInt());                           //with this help whatever input it will show output
        }
        System.out.println(list);                          
        
        //get an item at any index
        for(int i = 0; i<5; i++){
            System.out.println(list.get(i));
        }
    }
}
