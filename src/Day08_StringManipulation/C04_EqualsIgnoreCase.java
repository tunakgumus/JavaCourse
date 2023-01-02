package Day08_StringManipulation;

public class C04_EqualsIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Pazar";
        String str2 = "PAZAR";
        String str3 = "pazar";

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str1));

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str2.equalsIgnoreCase(str3));
        System.out.println(str3.equalsIgnoreCase(str1));




    }
}
