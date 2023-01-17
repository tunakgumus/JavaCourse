package Day23_dayTime_Varargs;

public class C05_Varargs {
    public static void main(String[] args) {
        //Verilen 2 sayiyi toplayip yazdiracak bir method olusturun

        topla(5,8);
        topla(5,8,6);
    }

    private static void topla(int i, int i1, int i2) {
        System.out.println(i+i1+i2);
    }

    private static void topla(int i, int i1) {
        System.out.println(i+i1);
    }
}
