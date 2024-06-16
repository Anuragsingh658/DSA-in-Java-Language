import java.util.*;

public class Syntax {
    public static void Printletter(String str){
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i) +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        // String str = "abcd"; // 1st Method
        String str = new String("abcd"); // 2nd Method

        // Strings are IMMUTABLE

        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();                //it help to print the after spacibg line
        System.out.println(name);
        System.out.println(name.length());     //it shows the lenght of the character

        // Concatenation :- Means adding two characters or String values
        String firstname = "Anurag";
        String lastname = "Singh";
        String fullname = firstname + " " + lastname;    //Simply it add the two string characters
        System.out.println(fullname.charAt(1)); //it will help to find the character from the when we enter the index value

        Printletter(fullname); //calling the function and print whatever we want aas per the lenght
    }
}
