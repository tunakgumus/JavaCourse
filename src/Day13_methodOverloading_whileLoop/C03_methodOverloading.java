package Day13_methodOverloading_whileLoop;

public class C03_methodOverloading {
    public static void main(String[] args) {
        toplama('a','b');

    }
    public static void toplama(int sayi1, double sayi2) {
        System.out.println("2 sayinin toplami : " + (sayi1 + sayi2));
    }
    public static void toplama(double sayi1, double sayi2) {
        System.out.println("2 double sayinin toplami : " + (sayi1 + sayi2));
    }
}
