package Day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_remove {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(9);
        System.out.println(sayilar);
        //sayilar.remove(5);
        Integer silinecekElement =5;
        sayilar.remove(silinecekElement);
        System.out.println(sayilar);
        System.out.println(sayilar.size());
    }
}
