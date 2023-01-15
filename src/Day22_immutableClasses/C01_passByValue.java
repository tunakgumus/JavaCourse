package Day22_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_passByValue {
    public static void main(String[] args) {
        //verilen bir list de degisiklik yapan 2 method olusturun
        // 1. method listin elementlerine yeni deger atayip yazdirsin
        // 2. method liste yeni bir list degeri atayip yeni liste elementler ekleyip yazdirsin
        //her iki methodu cagirdiktan sonra main methoddaki listi yazdiralim
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(34);
        sayilar.add(45);
        System.out.println(sayilar);

        elemanlariDegistir(sayilar);

        System.out.println("1. method calldan sonra sayilar : " + sayilar);

        yeniListAta(sayilar);
        System.out.println("2. method calldan sonra sayilar : " + sayilar);



    }
    public static void elemanlariDegistir (List<Integer> sayilar){
    sayilar.set(0,25);
    sayilar.set(1,54);
    sayilar.set(2,67);

    System.out.println("elemanlari degistir methodunda List : " + sayilar);
    }
    public static void yeniListAta (List<Integer> sayilar){
        sayilar=new ArrayList<>();
        sayilar.add(34);
        sayilar.add(98);
        sayilar.add(11);

        System.out.println("Yeni list ata methodu : " + sayilar);

    }
}
