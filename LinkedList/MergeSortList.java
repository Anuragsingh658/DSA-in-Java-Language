public class MergeSortList {
        private Node head;
        private Node tail;
        private int size;
    
        public MergeSortList() {
            this.size = 0;
        }
        public void insertFirst(int val) {
            Node node = new Node(val);
            node.next = head;
            head = node;
    
            if (tail == null) {
                tail = head;
            }
            size++;
        }
        public void insertLast(int val){
            if(tail == null){
                insertFirst(val);
                return;
            }
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size++;
        }
        public static MergeSortList merge(MergeSortList first, MergeSortList second) {
            Node f = first.head;
            Node s = second.head;
    
            MergeSortList ans = new MergeSortList();
    
            while (f != null && s != null) {
                if (f.value < s.value) {
                    ans.insertLast(f.value);
                    f = f.next;
                } else {
                    ans.insertLast(s.value);
                    s = s.next;
                }
            }
    
            while (f != null) {
                ans.insertLast(f.value);
                f = f.next;
            }
    
            while (s != null) {
                ans.insertLast(s.value);
                s = s.next;
            }
    
            return ans;
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
            MergeSortList first = new MergeSortList();
            MergeSortList second = new MergeSortList();
    
            first.insertLast(1);
            first.insertLast(3);
            first.insertLast(5);
    
            second.insertLast(1);
            second.insertLast(2);
            second.insertLast(9);
            second.insertLast(14);
    
            MergeSortList ans = MergeSortList.merge(first, second);
            ans.display();
        }
}
