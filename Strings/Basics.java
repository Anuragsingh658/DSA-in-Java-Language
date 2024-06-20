import java.util.Arrays;

public class Basics {
    public static void main(String[] args) {
        String name = "Anurag Singh";
        System.out.println(name);
        System.out.println('a' + 'b');
        System.out.println("a" + 'b');
        System.out.println('a' + "b");
        System.out.println(Arrays.toString(name.toCharArray()));//it create 
        System.out.println(name.indexOf('g'));//At which char is
        System.out.println("      Anurag     ".strip());//It remove extra spaces
        System.out.println(Arrays.toString(name.split(" ")));//it breaks and give comma after the spaces
    }
}
