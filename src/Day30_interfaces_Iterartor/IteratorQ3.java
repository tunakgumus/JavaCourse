package Day30_interfaces_Iterartor;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorQ3 {
    //(iterator ile index kullanimina ornek) Bir listedeki ilk n elemani iterator
    //kullanarak 5 artirin.
    //Orn : list : [2,13,56,23,45,14,40]
    //artirilmasi istenen eleman sayisi : 3
    //output: [7,18,61,23,45,14,40]
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(13);
        list.add(56);
        list.add(23);
        list.add(45);
        list.add(14);
        list.add(40);

        ListIterator lit = list.listIterator();
        for (int i = 1; i <= 3; i++) {
            Integer sayi = (Integer) lit.next();
            lit.set(sayi + 5);

        }
        System.out.println(list);
    }
}
