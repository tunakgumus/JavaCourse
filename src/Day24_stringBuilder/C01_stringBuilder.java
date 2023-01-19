package Day24_stringBuilder;

public class C01_stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.capacity());

        StringBuilder sb2 = new StringBuilder(11);
        System.out.println(sb2.capacity());

        StringBuilder sb3= new StringBuilder("Java candir");
        System.out.println(sb3.capacity());

        sb2.append("Java");
        System.out.println(sb2);
        System.out.println(sb2.capacity());

        sb2.append("Java candir ");
        System.out.println(sb2);
        System.out.println(sb2.capacity());



    }
}
