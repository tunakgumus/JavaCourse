package Day33_maps;

import Day32_setsMaps.mapMethodDepo;

import java.util.Map;

public class C07_sinifSiraliListeOlusturma {
    public static void main(String[] args) {
        Map<Integer,String> sinifMapi = mapMethodDepo.ogrenciMapOlustur();
        mapMethodDepo.sinifSiraliListeYazdir(sinifMapi);
    }
}
