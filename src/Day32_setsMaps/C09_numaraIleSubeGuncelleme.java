package Day32_setsMaps;

import java.util.Map;

public class C09_numaraIleSubeGuncelleme {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap= mapMethodDepo.ogrenciMapOlustur();

        mapMethodDepo.numaraIleSubeGuncelleme(ogrenciMap,101,"M");
    }
}
