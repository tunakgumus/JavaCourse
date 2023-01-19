package Day24_stringBuilder;

public class C03_stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str = "Java";

        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));

        System.out.println(sb1.compareTo(sb2));
        StringBuilder sb3 = new StringBuilder("Hava");
        System.out.println(sb1.compareTo(sb3));
    }
}
