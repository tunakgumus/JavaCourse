package Day31_collections;

import java.util.LinkedList;
import java.util.List;

public class C02_LinkedList {
    public static void main(String[] args) {
        List<String> harfler =new LinkedList<>();
        harfler.add("H");
        harfler.add("K");
        System.out.println(harfler);

        harfler.add("H");
        System.out.println(harfler);

        harfler.add(1,"M");
        System.out.println(harfler);

        harfler.set(2,"L");
        System.out.println(harfler);

        LinkedList<String> karakterler = new LinkedList<>();

        karakterler.add("*");
        karakterler.add("#");
        karakterler.add("9");
        karakterler.add(2,"M");
        System.out.println(karakterler);

        System.out.println(harfler.retainAll(karakterler));

        System.out.println(harfler);


        System.out.println(harfler.addAll(karakterler));
        System.out.println(harfler);

        harfler.removeAll(karakterler);
        System.out.println(harfler);

        System.out.println(karakterler.subList(1, 3));

        System.out.println(karakterler.hashCode());
    }
}
