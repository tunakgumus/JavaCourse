package Day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_size {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(9);
        System.out.println(sayilar.size());
        sayilar.clear();
        sayilar.size();
    }
}
