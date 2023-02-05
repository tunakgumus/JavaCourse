package Day31_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_queue {
    public static void main(String[] args) {
        Queue<String>harfler = new LinkedList<>();

        harfler.add("H");
        harfler.add("K");
        harfler.add("B");
        harfler.add("K");
        System.out.println(harfler);

        System.out.println(harfler.remove());
        System.out.println(harfler);

        harfler.remove("K");
        System.out.println(harfler);

        System.out.println(harfler.element());

        System.out.println(harfler.peek());

        Queue<String> karakterler = new LinkedList<>();

        //System.out.println(karakterler.element());
        System.out.println(karakterler.peek());

        System.out.println(harfler.poll());
        System.out.println(harfler);

        System.out.println(harfler.offer("C"));
        System.out.println(harfler);
    }
}
