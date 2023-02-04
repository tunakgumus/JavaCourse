package Day30_interfaces_Iterartor;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorQ2 {
    public static void main(String[] args) {
        //Bir listedeki elementleri iterator kullanarak sondan basa dogru yazdirin
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(13);
        list.add(56);
        list.add(23);
        list.add(45);
        list.add(14);
        list.add(40);

        ListIterator lit = list.listIterator();
       while (lit.hasNext()){
           Integer sayi = (Integer)lit.next();
       }
       while (lit.hasPrevious()){
           Integer sayi = (Integer)lit.previous();
           System.out.print(sayi + " ");
       }
    }
}
