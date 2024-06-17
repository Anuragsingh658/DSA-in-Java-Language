public class RemoveDupInString {
    public static void removedup(String str, int index, StringBuilder newstr, boolean[] map){
        if(index == str.length()){
            System.out.println(newstr);
            return;
        }

        // kaaam
        char currchar = str.charAt(index);
        if(map[currchar-'a'] == true){
            //duplicate
            removedup(str, index+1, newstr, map);
        }else{
            map[currchar-'a'] = true;
            removedup(str, index+1, newstr.append(currchar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        removedup(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
