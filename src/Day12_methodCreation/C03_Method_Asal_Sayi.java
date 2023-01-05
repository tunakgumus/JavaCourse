package Day12_methodCreation;

public class C03_Method_Asal_Sayi {
    public static void main(String[] args) {
        //verilen bir sayinin asal olup olmadığını true yada false olarak donduren bir method olusturun.
        System.out.println(asalSayiMi(17));
    }

    public static boolean asalSayiMi(int sayi) {
        boolean asalSayiMi = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asalSayiMi= false;
                break;
            }

        }
        return asalSayiMi;
    }
}

