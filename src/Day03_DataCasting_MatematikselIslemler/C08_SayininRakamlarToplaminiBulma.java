package Day03_DataCasting_MatematikselIslemler;

import javax.sound.midi.Soundbank;
import java.net.Socket;
import java.util.Scanner;

public class C08_SayininRakamlarToplaminiBulma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamaklı bir sayi giriniz");
        int girilenSayi = scan.nextInt();

        int birlerBas = girilenSayi%10;
        girilenSayi=girilenSayi/10;
        int onlarBas = girilenSayi%10;
        girilenSayi=girilenSayi/10;
        int yuzlerBas = girilenSayi%10;
        girilenSayi=girilenSayi/10;
        int binlerBas = girilenSayi;

        System.out.println(birlerBas + onlarBas + yuzlerBas + binlerBas);



    }
}
