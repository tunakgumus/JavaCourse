package Day08_StringManipulation;

public class C07_Substring {
    public static void main(String[] args) {
        String str = "Java ogren isi kap";
        System.out.println(str.length());
        System.out.println(str.charAt(str.length()/2));
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.substring(5,10));
        System.out.println(str.substring(str.length()-3,str.length()));
        System.out.println(str.substring(9,10).toUpperCase());

    }
}
