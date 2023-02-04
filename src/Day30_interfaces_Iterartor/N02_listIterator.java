package Day30_interfaces_Iterartor;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class N02_listIterator {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(9);
        sayilar.add(11);

        ListIterator lit = sayilar.listIterator();
        while (lit.hasNext()) {
            Integer sayi = (Integer) lit.next();
            lit.set(sayi + 3);
        }
        System.out.println(sayilar);
        while (lit.hasPrevious()) {
            System.out.print(lit.previous() + " ");
        }
    }
}