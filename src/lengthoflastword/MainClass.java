package lengthoflastword;

public class MainClass {
    public static void main(String[] args) {
        String y= "hello world";
        System.out.println(lengthOfLAstWord(y));

    }

    static int lengthOfLAstWord(String s){
        String trimmed = s.trim();
        if (!trimmed.isEmpty()) {
            String[] pieces = trimmed.split(" ");
            return pieces[pieces.length-1].length();
        }else
        return 0;
    }
}
