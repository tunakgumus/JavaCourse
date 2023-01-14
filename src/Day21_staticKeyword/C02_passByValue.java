package Day21_staticKeyword;

public class C02_passByValue {
    public static void main(String[] args) {
        int fiyat = 100;
        //fiyat uzerinden %10 indirim yapip indirimli fiyati donduren bir method yapin
        System.out.println(indirimYap10(fiyat));
        System.out.println(fiyat);
    }

    private static int indirimYap10(int fiyat) {
        fiyat *=0.9;
        return fiyat;
    }

}
