package Day33_maps;

import Day32_setsMaps.mapMethodDepo;

import java.util.Map;

public class C08_isimSoyisimSiraliListe {
    public static void main(String[] args) {
        Map<Integer,String> sinifMapi = mapMethodDepo.ogrenciMapOlustur();
        mapMethodDepo.isimSoyisimSiraliListeYazdir(sinifMapi);
    }
}
