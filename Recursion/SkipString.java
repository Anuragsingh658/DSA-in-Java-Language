public class SkipString {
    public static void main(String[] args) {
        // skip("", "baccdah");
        // System.out.println(skip2("baccdah"));
        System.out.println(skipApple("bcdappledfh"));
    }
    static void skip(String p, String up){          //P = process or up = Unprocess
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p, up.substring(1));
        }else{
            skip(p + ch, up.substring(1));
        }
    }

    //2nd Method
    static String skip2(String up){          //up = Unprocess
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            return skip2(up.substring(1));
        }else{
            return ch + skip2(up.substring(1));
        }
    }

    //for skiping full string like apple
    static String skipApple(String up){          //up = Unprocess
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }
}
