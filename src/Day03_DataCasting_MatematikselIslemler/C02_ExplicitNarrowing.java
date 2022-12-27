package Day03_DataCasting_MatematikselIslemler;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {
        double dbl = 23.5;
        int sayi= (int)dbl;
        System.out.println(sayi);
        byte byt = (byte)sayi;
        System.out.println(byt);

        sayi = 255;
        byt = (byte)sayi;
        System.out.println(byt);




    }
}
