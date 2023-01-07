package Day14_doWhileLoopScope;

import java.util.Scanner;

public class C04_doWhileSoru {
    public static void main(String[] args) {
        //Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
        //kontrol edin ve sifredeki hatalari yazdirin.
        //Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
        //sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
        //- Sifre kucuk harf icermelidir
        //- Sifre buyuk harf icermelidir
        //- Sifre ozel karakter icermelidir
        //- Sifre en az 8 karakter olmalidir.
        String sifre ="";
        Scanner scan= new Scanner(System.in);
        int flag=0;
        int sayi=0;

        do {
            System.out.println("lutfen bir sifre giriniz");
            sifre=scan.nextLine();
            flag=0;
            if(sifre.matches(".*[a-z].*")){
                flag++;
            }else System.out.println("sifre kucuk harf icermelidir");
            if(sifre.matches(".*[A-Z].*")){
                flag++;
            } else System.out.println("sifre buyuk harf icermelidir");
            if (sifre.matches(".*[!@#$%^&*].*")){
                flag++;
            }else System.out.println("sifre ozel karakter icermelidir");
            if (sifre.length()>=8){
                flag++;
            }else System.out.println("sifre en az 8 karakter olmalidir");
            if (flag==4)System.out.println("Sifre basari ile kaydedilmistir");

        }while (flag!=4);

    }
}
