package Day33_maps;

import Day32_setsMaps.mapMethodDepo;

import java.util.Map;

public class C06_siniflariArttirma {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap = mapMethodDepo.ogrenciMapOlustur();
        mapMethodDepo.siniflariArttirma (ogrenciMap);
        System.out.println(ogrenciMap);
    }
}
