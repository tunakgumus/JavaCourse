package Day32_setsMaps;

import java.util.HashMap;
import java.util.Map;

public class C06_value {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap = new HashMap<>();
        ogrenciMap=mapMethodDepo.ogrenciMapOlustur();
        ogrenciMap.put(110,"Cemal-Han-12-M-MF");

        System.out.println(ogrenciMap);

        System.out.println(ogrenciMap.keySet());
        System.out.println(ogrenciMap.values());

        boolean sonuc = mapMethodDepo.isimIleOgrenciArama(ogrenciMap,"Ali");
        System.out.println(sonuc);

        System.out.println(mapMethodDepo.isimIleOgrenciArama(ogrenciMap,"Eylül"));

        System.out.println(mapMethodDepo.isimIleOgrenciArama(ogrenciMap,"Cemal"));

        System.out.println(mapMethodDepo.isimIleOgrenciArama(ogrenciMap,"Kemal"));
    }
}
