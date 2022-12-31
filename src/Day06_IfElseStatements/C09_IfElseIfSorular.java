package Day06_IfElseStatements;

import java.util.Scanner;

public class C09_IfElseIfSorular {
    public static void main(String[] args) {
        //Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        //karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        //%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        //alirsa %15, yoksa %10 indirim yapin
        Scanner scan = new Scanner(System.in);
        System.out.println("Ürün adedini giriniz");
        int urunAdedi = scan.nextInt();
        System.out.println("Liste Fiyati Giriniz");
        int listeFiyati = scan.nextInt();
        System.out.println("Müşteri Kartınız var mı?");
        char kartBilgisi = scan.next().charAt(0);
        kartBilgisi = Character.toUpperCase(kartBilgisi);
        if (kartBilgisi=='E' && urunAdedi>10){
            System.out.println(listeFiyati*urunAdedi* .80);
        } else if (kartBilgisi=='E' && urunAdedi<=10) {
            System.out.println(listeFiyati*urunAdedi*.85);
        } else if (kartBilgisi=='H' && urunAdedi<=10) {
            System.out.println(listeFiyati*urunAdedi*.90);
        } else if (kartBilgisi=='H' && urunAdedi>10) {
            System.out.println(listeFiyati*urunAdedi*.85);
        }else System.out.println("geçerli bilgi giriniz");
    }
}
