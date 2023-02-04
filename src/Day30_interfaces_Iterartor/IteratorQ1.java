package Day30_interfaces_Iterartor;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorQ1 {
    //Bir listedeki istenen sayi araliginda olmayan elementleri silen bir program
    //yaziniz . (2. liste olusturmadan, gecerli liste uzerinde islem yapiniz)
    //Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
    //output: [23,40]
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

        while (lit.hasNext()){
            Integer sayi = (Integer) lit.next();
            if (! (sayi<=40 && sayi>=20)){
              lit.remove();
            }
        }
        System.out.println(list);
    }
}

