package Day10_StringManipulation;

public class C01_nullPointer {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "    ";
        String str3;
        String str4= null;

        System.out.println(str1.length());
        System.out.println(str2.length());

        System.out.println(str1.isEmpty());
        System.out.println(str2.isEmpty());

        System.out.println(str1.isBlank());
        System.out.println(str2.isBlank());

        // System.out.println(str3.length());
        // System.out.println(str1.concat("ali can"));
        // System.out.println(str3.substring(3,4));
        // deger atamadigin bir stringi kullanmaya calisirsan Java CTE verir.

       // System.out.println(str4.length());
       //  System.out.println(str4.substring(3, 4));
        // null ile isaretlenmis bir variable ı kullanmaya kalkarsan "null point exception" alınır.
    }
}
