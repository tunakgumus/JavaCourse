package Day21_staticKeyword;

public class C04_passByValue {
    public static void main(String[] args) {
        int fiyat =100;
        //%10 ,%20 ve %30 indirim uygulayip yazdiran 3 method yapin
        indirimYap10(fiyat);
        indirimYap20(fiyat);
        indirimYap30(fiyat);
        System.out.println(fiyat);
    }
    private static void indirimYap10(int fiyat) {
        fiyat *=0.9;
        System.out.println("%10 indirimli fiyat : " + fiyat);
    }
    private static void indirimYap20(int fiyat) {
        fiyat *=0.8;
        System.out.println("%20 indirimli fiyat : " + fiyat);
    }
    private static void indirimYap30(int fiyat) {
        fiyat *=0.7;
        System.out.println("%30 indirimli fiyat : " + fiyat);
    }
}
