package Day13_methodOverloading_whileLoop;

public class C02_methodOverloading {
    public static void main(String[] args) {
        String str = "Java cok guzel";
        System.out.println(str.substring(5));
        System.out.println(str.substring(3,5));
        toplama(5,6);

    }

    public static void toplama(int sayi1, int sayi2) {
        System.out.println("2 sayinin toplami : " + (sayi1+sayi2));
    }
    public static void toplama(int A, int B, int C) {
        System.out.println("3 sayinin toplami : " + (A +B+C));
    }
    public static void toplama(double sayi1, int sayi2) {
        System.out.println("2 sayinin toplami : " + (sayi1 + sayi2));
    }
    public static void toplama(int sayi1, double sayi2) {
        System.out.println("2 sayinin toplami : " + (sayi1 + sayi2));
    }

}

