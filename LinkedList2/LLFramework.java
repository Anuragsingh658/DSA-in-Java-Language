import java.util.LinkedList;
public class LLFramework {
    public static void main(String[] args) {
        //create
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.add(1);
        ll.add(2);
        ll.addFirst(0);

        // print
        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
