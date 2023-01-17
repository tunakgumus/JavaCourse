package Day23_dayTime_Varargs;

public class C06_Varargs {
    public static void main(String[] args) {
        //Oyle bir  method olustaryim ki kac tane arg yazarsam yazayim toplamlari versin
        topla(5,8,6,3);
    }

    private static void topla(int... sayi) {
        int toplam=0;
        for (int each: sayi

             ) {
            toplam= toplam+each;

        }
        System.out.println(toplam);
    }
}
