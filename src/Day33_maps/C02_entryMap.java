package Day33_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C02_entryMap {
    public static void main(String[] args) {
        // Tum ogrencileri 101=Ali-Can-11-H-MF seklinde yazdirin
        Map<Integer, String> ogrenciMap = new HashMap();

        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");

        Set<Integer> ogrenciNoSeti = ogrenciMap.keySet();

        for (Integer eachKey : ogrenciNoSeti
        ) {
            System.out.println(eachKey + "= " + ogrenciMap.get(eachKey));
        }
        System.out.println("===================================");
        Set<Map.Entry<Integer,String>> ogrenciEntrySet=ogrenciMap.entrySet();

        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySet
             ) {
            System.out.println(eachEntry );
        }
    }
}
