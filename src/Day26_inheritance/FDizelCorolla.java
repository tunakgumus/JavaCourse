package Day26_inheritance;

public class FDizelCorolla extends ECorolla{
    String motor ="1.6 Dizel Motor";
    String yakit ="Dizel";
    String guvenlik= "ABS";
    String renk = "renk belirtilmedi";

    public static void main(String[] args) {
        ECorolla c2= new FDizelCorolla();
        System.out.println(c2.yakit);
        System.out.println(c2.motor);
        // CTE System.out.println(c2.guvenlik);
        // CTE System.out.println(c2.renk);

        System.out.println(c2.model);
        System.out.println(c2.uretimYeri);
        System.out.println(c2.teker);
        System.out.println(c2.vites);

        System.out.println(c2.marka);


        FDizelCorolla c1 =new FDizelCorolla();
        System.out.println(c1.yakit);
        System.out.println(c1.motor);
        System.out.println(c1.guvenlik);
        System.out.println(c1.renk);


        System.out.println(c1.model);
        System.out.println(c1.uretimYeri);
        System.out.println(c1.teker);
        System.out.println(c1.vites);

        System.out.println(c1.marka);

    }
}
