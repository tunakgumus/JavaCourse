package Day33_maps;

import Day32_setsMaps.mapMethodDepo;

import java.util.Map;

public class C03_sinifListesiYazdirma {
    public static void main(String[] args) {
        //verilen siniftaki ogrencilerin no, isim, soyisim, bolumlerini bir liste olarak yazdiran bi method olusturun.

        Map<Integer,String> ogrenciMap = mapMethodDepo.ogrenciMapOlustur();
        mapMethodDepo.sinifListesiYazdirma(ogrenciMap,"11");

    }
}
