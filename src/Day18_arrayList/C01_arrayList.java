package Day18_arrayList;

import Day16_arrays.C10_arrayeElementEkleme;
import Day17_arrays.C10_MDA_Soru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class C01_arrayList {
    public static void main(String[] args) {
        String [] arr ={"A","B","T"};
        //Bu arraye C elementi eklemek istiyoruz
        System.out.println(Arrays.toString(C10_arrayeElementEkleme.arrayeBirElementEkleme(arr, "C")));

        List <String> harfler = new ArrayList<>();
        System.out.println(harfler);
        harfler.add("A");
        harfler.add("B");
        harfler.add("K");
        System.out.println(harfler);

        harfler.add(1,"C");
        System.out.println(harfler);
        harfler.add(3,"D");
        System.out.println(harfler);

        List<String> karakterler =new ArrayList<>();
        karakterler.add("*");
        karakterler.add("#");
        harfler.addAll(karakterler);
        System.out.println(harfler);
        harfler.addAll(2,karakterler);
        System.out.println(harfler);
    }


}
