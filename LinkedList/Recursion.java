public class Recursion {
    private Node head;
    private Node tail;
    private int size;

    public Recursion() {
        this.size = 0;
    }
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index-1, node.next);
        return node;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        Recursion rec = new Recursion();
        rec.insertRec(12, 0);
        rec.insertRec(24, 1);
        rec.insertRec(36, 2);
        rec.insertRec(48, 3);
        rec.display();
    }
}
