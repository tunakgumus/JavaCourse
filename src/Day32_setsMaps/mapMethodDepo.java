package Day32_setsMaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class mapMethodDepo {
    public static Map<Integer, String> ogrenciMapOlustur() {
        Map<Integer, String> ogrenciMap = new HashMap();

        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");

        return ogrenciMap;
    }

    public static boolean isimIleOgrenciArama(Map<Integer, String> ogrenciMap, String isim) {
        Collection<String> valuesCollection= ogrenciMap.values();
        for (String each:valuesCollection
             ) {
             String[] arr = each.split("-");
             if(arr[0].equalsIgnoreCase(isim)){
                 return true;
            }
        }
        return false;
}

    public static void soyIsimleOgrenciArama(Map<Integer, String> ogrenciMap, String soyisim) {
        Collection<String> valuesCollection= ogrenciMap.values();
        for (String each:valuesCollection
        ) {
            String[] arr = each.split("-");
            if(arr[1].equalsIgnoreCase(soyisim)){
                for (int i = 0; i < arr.length ; i++) {
                    System.out.print(arr[i] + "\t\t");

                }
                System.out.println("");
            }
        }

    }

    public static void subeListesiOlusturma(Map<Integer, String> ogrenciMap, String sinif, String sube) {
        Collection<String> valuesCollection= ogrenciMap.values();
        for (String each:valuesCollection
        ) {
            String[] arr = each.split("-");
            if(arr[2].equalsIgnoreCase(sinif)){
                if (arr[3].equalsIgnoreCase(sube)){
                    for (int i = 0; i < arr.length ; i++) {
                        System.out.print(arr[i] + "\t\t");
                    }
                }
                System.out.println("");
            }
        }
    }

    public static Map<Integer, String> numaraIleSubeGuncelleme(Map<Integer, String> ogrenciMap, int ogrNo, String yeniSube) {
        String ogrenciValue = ogrenciMap.get(ogrNo);
        String[] arr = ogrenciValue.split("-");
        arr[3]=yeniSube;
        String yeniValue=arr[0]+"-"+arr[1]+"-"+arr[2]+"-"+arr[3]+"-"+arr[4];
        ogrenciMap.put(ogrNo,yeniValue);
        return ogrenciMap;

}
}
