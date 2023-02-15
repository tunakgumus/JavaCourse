package Day34_maps_nestepMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_nestedOgrenciMapi {
    public static void main(String[] args) {
        Map<Integer, Map<String,String>> ogrenciMap = new HashMap();


        Map<String,String> ogrenci101= new HashMap<>();
        ogrenci101.put("Isim","Ali");
        ogrenci101.put("Soyisim","Can");
        ogrenci101.put("Sinif","11");
        ogrenci101.put("Sube","H");
        ogrenci101.put("Bolum","MF");


        Map<String,String> ogrenci102= new HashMap<>();
        ogrenci102.put("Isim","Veli");
        ogrenci102.put("Soyisim","Cem");
        ogrenci102.put("Sinif","10");
        ogrenci102.put("Sube","K");
        ogrenci102.put("Bolum","TM");

        Map<String,String> ogrenci103= new HashMap<>();

        ogrenci103.put("Isim","Ali");
        ogrenci103.put("Soyisim","Cem");
        ogrenci103.put("Sinif","11");
        ogrenci103.put("Sube","K");
        ogrenci103.put("Bolum","TM");

        ogrenciMap.put(101,ogrenci101);
        ogrenciMap.put(102,ogrenci102);
        ogrenciMap.put(103,ogrenci103);

        System.out.println(ogrenciMap.get(101).get("Isim"));

        System.out.println(ogrenciMap.get(102).get("Sinif"));

        Set<Map.Entry<Integer, Map<String, String>>> ogrenciEntrySeti= ogrenciMap.entrySet();
        for (Map.Entry<Integer, Map<String, String>> each: ogrenciEntrySeti
             ) {
            if (each.getKey()==103){
                Map<String, String> eachOgrenciValueMap = each.getValue();
                eachOgrenciValueMap.put("Sinif","12");

                each.setValue(eachOgrenciValueMap);
            }
        }
        System.out.println(ogrenciMap   );

    }
}
