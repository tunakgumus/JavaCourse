package Day32_setsMaps;

import java.util.Map;

public class C07_soyIsimleOgrenciArama {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap =  mapMethodDepo.ogrenciMapOlustur();

        mapMethodDepo.soyIsimleOgrenciArama (ogrenciMap,"Cem");
    }

}
