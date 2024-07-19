public class SLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data){  
        size++;                //time complexity O(1)
        //step1 ---> create new node
        Node newNode = new Node(data);
        //if my linked list is empty
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2 ----> newnode next = head
        newNode.next = head;

        //step3 -----> head = newnode
        head = newNode;
    }

    public void addlast(int data){                        //time complexity O(1)
        size++;
        //step1 ---> create new node
        Node newNode = new Node(data);
        //if my linked list is empty
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step2-----> tail.next = newnode
        tail.next = newNode;
        
        //step3-----> tail = newnode
        tail = newNode;
    } 

    public void addmiddle(int index, int data){
        if(index == 0){
            addfirst(data);
            return;
        }
        size++;
        //step1 ---> create new node
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i < index - 1){
            temp = temp.next;
            i++;
        }
        //i = index - 1; temp -> previous
        newNode.next = temp.next;
        temp.next = newNode;
    } 

    public int removefirst(){
        if(size == 0){
            System.out.println("LL  is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val  = head.data;
        head = head.next;
        return val;
    }

    public int removelast(){
        if(size == 0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i = 0; i < size-2; i++){
            prev = prev.next;
        } 
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int IterativeSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    } 

    public int helper(Node head, int key){                 //time complexity --->O(n)
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int index = helper(head.next, key);
        if(index == -1){
            return -1;
        }
        return index + 1;
    }
    public int RecursiveSearch(int key){
        return helper(head, key);
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthFromEnd(int n){
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        if(n == size){
            head = head.next;
            return;
        }
        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public void display(){               //time complexity O(n)
        if(head == null){
            System.out.println("LL is  Empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        SLL ll = new SLL();
        ll.addfirst(2);
        ll.addfirst(4);
        ll.addfirst(8);
        ll.addlast(32);
        ll.addlast(23);
        ll.display();
        ll.addmiddle(2, 45);
        ll.display();
        // System.out.println(ll.size);
        ll.removefirst();
        ll.removelast();
        ll.display();
        System.out.println(ll.IterativeSearch(32));
        System.out.println(ll.RecursiveSearch(23));
        ll.reverse();
        ll.display();
        ll.deleteNthFromEnd(3);
        ll.display();
    }
}
