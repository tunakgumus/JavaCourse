package Day24_stringBuilder;

public class C04_accessModifier {
    String str;
    public static void main(String[] args) {
    D obj1=new D();
        System.out.println(obj1.defaultIsim);
        obj1.defaultStaticOlmayanMethod();
        System.out.println(obj1.staticDefaultIsim);
        System.out.println(D.staticDefaultIsim);

        obj1.defaultStaticMethod();
        D.defaultStaticMethod();
    }
}
