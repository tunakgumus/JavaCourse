package Day32_setsMaps;

import java.util.HashMap;
import java.util.Map;

public class C05_maps {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap =new HashMap();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");

        System.out.println(ogrenciMap);

        System.out.println(ogrenciMap.size());

        System.out.println(ogrenciMap.containsKey(103));
        System.out.println(ogrenciMap.containsValue("Ali"));
        System.out.println(ogrenciMap.containsValue("Ali-Can-11-H-MF"));

    }
}
