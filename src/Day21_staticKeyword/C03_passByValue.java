package Day21_staticKeyword;

public class C03_passByValue {
    public static void main(String[] args) {
        int s =20;
        System.out.println(s);
        //String s= "hasan";
        method1();
    }
    public static void method1(){
        method2(5);
        String s = "Hasan";
        System.out.println(s.toLowerCase());

    }

    public static void method2(int s) {
        s=s*s;
        System.out.println(s);
    }
}
