package Day33_maps;

import Day32_setsMaps.mapMethodDepo;

import java.util.Map;

public class C05_soyisimleriBuyukHarfYapma {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap = mapMethodDepo.ogrenciMapOlustur();
        ogrenciMap=mapMethodDepo.soyIsimleriBuyukHarfYapma (ogrenciMap);

        System.out.println(ogrenciMap);
    }
}
