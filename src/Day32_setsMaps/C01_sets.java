package Day32_setsMaps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C01_sets {
    public static void main(String[] args) {
        Set<Object> karisikSet = new HashSet<>();

        karisikSet.add(12);
        karisikSet.add("Java");
        karisikSet.add('S');
        karisikSet.add(false);

        int[] arr = new int[3];

        karisikSet.add(arr);

        List<Object> karisikList = new ArrayList<>();
        karisikList.add("Hava");
        karisikList.add(44);

        karisikSet.add(karisikList);

        System.out.println(karisikList);
        System.out.println(karisikSet );




    }
}
