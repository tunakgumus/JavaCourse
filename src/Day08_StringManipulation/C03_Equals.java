package Day08_StringManipulation;

public class C03_Equals {
    public static void main(String[] args) {
        String str = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = "Ja";
        String str5 = str4.concat("va");
        System.out.println(str == str2);
        System.out.println(str==str3);
        System.out.println(str==str5);

        System.out.println(str.equals(str2));
        System.out.println(str.equals(str3));
        System.out.println(str.equals(str5));




    }
}
