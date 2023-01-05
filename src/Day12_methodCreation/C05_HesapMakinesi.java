package Day12_methodCreation;

import java.util.Scanner;

public class C05_HesapMakinesi {
    public static void main(String[] args) {
        //Kullanicidan 2 sayi ve istedigi islemi alin. Bir method olusturun sayilara istenen islemi uygulayıp
        //sonucu bize döndürün
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen 2 sayi ve yapmak istediginiz islemi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        char islem = scan.next().charAt(0);
        if(!(islem=='*' || islem=='/' || islem=='+' || islem=='-')){
            System.out.println("yanlis islem girisi");
        } else System.out.println(hesapMakinesi(sayi1, sayi2, islem));


    }
    public static int hesapMakinesi (int sayi1, int sayi2 , char islem){
        int sonuc = 0;
        switch (islem){

            case '+' : sonuc= sayi1+sayi2;
                break;
            case '*' : sonuc= sayi1*sayi2;
                break;
            case '/' : sonuc= sayi1/sayi2;
                break;
            case '-' : sonuc= sayi1-sayi2;
                break;
        }

        return sonuc;

    }
}
