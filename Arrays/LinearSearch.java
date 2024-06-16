public class LinearSearch {
    public static int Linear_Search(int numbers[], int key){
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
        System.out.println("Key is at index:" + Linear_Search(number, key));
    }
}