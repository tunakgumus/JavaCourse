package Day34_maps_nestepMaps;

import Day32_setsMaps.mapMethodDepo;

import java.util.Map;

public class C03_mapMEthodlari {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap = mapMethodDepo.ogrenciMapOlustur();

        System.out.println(ogrenciMap.getOrDefault(123, "Ogrenci bulunamadi"));
        ogrenciMap.replace(103,"Ali-Cem-11-K-MF");
        System.out.println(ogrenciMap.get(103));
  }
}
