package Day30_interfaces_Iterartor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class N01_Iterator {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(9);
        sayilar.add(11);

        System.out.println(sayilar);

        for (Integer each:sayilar
             ) {
            System.out.print(each+3 + " ");
        }
        Iterator itr = sayilar.iterator();

        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());

        System.out.println(itr.hasNext());

        itr=sayilar.iterator();
        System.out.println(itr.hasNext());

        while (itr.hasNext()){
            System.out.print (itr.next()+" ");
        }

        itr=sayilar.iterator();
        while (itr.hasNext()){
            Integer sayi = (Integer) itr.next();
            if(sayi>5){
                itr.remove();
            }
        }
        System.out.println("");
        System.out.println(sayilar);
    }
}
