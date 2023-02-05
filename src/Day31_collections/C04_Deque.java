package Day31_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {
    public static void main(String[] args) {
        Deque<String> harfler = new LinkedList<>();
        harfler.add("J");
        harfler.add("L");
        System.out.println(harfler);

        harfler.addFirst("B");
        System.out.println(harfler);

        harfler.removeFirst();
        harfler.addFirst("A");
        harfler.addLast("A");
        harfler.add("K");
        System.out.println(harfler);

        System.out.println(harfler.removeLastOccurrence("A"));
        System.out.println(harfler);

        System.out.println(harfler.removeLastOccurrence("T"));

        LinkedList<String> karakterler = new LinkedList<>();
        karakterler.push("A");
        karakterler.push("B");

        LinkedList<String> karakterler2 = new LinkedList<>();
        karakterler2= (LinkedList<String>) karakterler.clone();
        System.out.println(karakterler2);


    }
}
