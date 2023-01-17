package Day23_dayTime_Varargs;

public class C08_varargs {
    public static void main(String[] args) {
        //Argument olarak tamsayilar alip
        //ilk argument haric geriye kalanları toplayip
        //bulunan toplami ilk argument ile carpip
        //sonucu yazdiran bir method olusturun
        //(not argument sayisi degisken olabilir)

        islemYap(3,6,4,7,5,9);
    }

    private static void islemYap(int... sayilar) {
        int carpilacakSayi=sayilar[0];
        int toplam=0;
        for (int i = 1; i <sayilar.length ; i++) {
            toplam +=sayilar[i];
        }
        System.out.println(carpilacakSayi*toplam);

    }
}
