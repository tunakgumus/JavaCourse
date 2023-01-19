package Day24_stringBuilder;

public class C02_stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.trimToSize();
        System.out.println(sb.capacity());
        System.out.println(sb.toString().toUpperCase());
        System.out.println(sb);

    }
}
