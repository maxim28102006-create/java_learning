package review1;

public class Capitalize {
    static String capitalize(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <s.length(); i++){
            char c = s.charAt(i);
            if(i == 0 || s.charAt(i-1) == ' '){
                sb.append(Character.toUpperCase(c));
            }else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(capitalize("hello world java"));
    }
}
