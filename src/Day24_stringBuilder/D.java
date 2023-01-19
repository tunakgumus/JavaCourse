package Day24_stringBuilder;

public class D {
    private  String isim ="Mustafa";
    String defaultIsim= "Furkan";
    static String staticDefaultIsim= "Sevilay";


    public static void main(String[] args) {
        // System.out.println(isim); static olmadigindan main  methodda kullanilamaz
        D obj1 = new D();
        System.out.println(obj1.isim);

        staticMethod();

        System.out.println(obj1.isim);
    }
    private void staticOlmayanMethod (){
        isim = "Hüseyin";
        System.out.println(isim);
    }

    void defaultStaticOlmayanMethod(){
        System.out.println("defaul access modifierlı static method olmayan method calisti");
    }

    static void defaultStaticMethod(){
        System.out.println("defaul access modifierlı static method olan method calisti");
    }
    private static void staticMethod(){
        D obj1 = new D();
        obj1.isim="Zafer";
        System.out.println(obj1.isim);

    }
}
