package Day22_immutableClasses;

public class C04_StringEqualsMethodu {
    public static void main(String[] args) {
        String str = "Java";
        String str2 = "Java";

        String str3 = new String("Java");
        String a = "Ja";
        String b ="va";
        String str4 = a+b;
        String str5 = a.concat(b);

        System.out.println(str.equals(str2));

        System.out.println(str.equals(str3));
        System.out.println(str.equals(str4));
        System.out.println(str.equals(str5));
        System.out.println("================================");
        System.out.println(str == str2);
        System.out.println(str == str3);
        System.out.println(str == str4);
        System.out.println(str == str5);

    }
}
