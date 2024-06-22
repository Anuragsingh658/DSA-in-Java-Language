public class CallingFunByFUnction {
    public static void main(String[] args) {
        message();                                        //call by only one function to all function
    }
    static void message(){
        System.out.println("Anurag Singh");
        message1();                                       //calling fuction by function
    }
    static void message1(){
        System.out.println("Anurag Singh");
        message2();
    }
    static void message2(){
        System.out.println("Anurag Singh");
        message3();
    }
    static void message3(){
        System.out.println("Anurag Singh");
    }
}
