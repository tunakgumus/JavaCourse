package Day18_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C14_soru {
    public static void main(String[] args) {
        //Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
        //tamsayilari bir liste olarak bize donduren bir method olusturun.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi =scan.nextInt();
        System.out.println(bolenlerList(sayi));
    }
    public static List bolenlerList (int sayi){
        List <Integer> list =new ArrayList<>();
        for (int i = 2; i <sayi-1 ; i++) {
            if(sayi%i==0){
                list.add(i);
            }

        }
        return list;
    }
}
