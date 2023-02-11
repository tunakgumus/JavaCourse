package Day33_maps;

import Day32_setsMaps.mapMethodDepo;

import java.util.Map;

public class C04_BolumListesiOlusturma {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap = mapMethodDepo.ogrenciMapOlustur();
        mapMethodDepo.bolumListesiOlusturma (ogrenciMap,"MF");
    }
}
