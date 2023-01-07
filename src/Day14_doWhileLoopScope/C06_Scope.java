package Day14_doWhileLoopScope;

public class C06_Scope {
    int sayi = 10;
    static int number;
    public static void main(String[] args) {
        String mainStr = "Java";
        number=10;
       // sayi=32;
        //System.out.println(method1str);
        for (int i = 0; i <=10 ; i++) {
            int toplam=i;
        }
        //System.out.println(toplam);
    }
    public static void method1(){
        String method1str ="guzeldir";
        number=15;
        //sayi=22;
        //System.out.println(mainStr);
    }
    public void method2(){
        String method2str = "candir";
        number = 30;
        sayi=22;
        //System.out.println(mainStr);
    }
}
