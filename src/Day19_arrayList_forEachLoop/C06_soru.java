package Day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_soru {
    public static void main(String[] args) {
        // Verilen String bir array’deki her bir elementi kontrol edip,
        //- Kelimenin uzunlugu cift sayi ise ilk yarisini
        //- Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        //yeni bir listeye ekleyip yazdirin.
        String [] isimler ={"Huseyin","Yusuf","Mehmet","Akile","Said"};
        List<String> listIsimler =new ArrayList<>();
        for (String each:isimler
             ) {
            if(each.length()%2==0){
                each=each.substring(0,each.length()/2);
                listIsimler.add(each);
            }else {
                each=each.substring(each.length()/2,each.length());
                listIsimler.add(each);
            }
        }
        System.out.println(listIsimler);
    }
}
