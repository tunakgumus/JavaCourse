package Day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C08_soru {
    public static void main(String[] args) {
        //Verilen iki array’in elementlerini karsilastirip, ikisinde ortak olan elementleri
        //ayri bir liste olarak veren bir program yazin.
        Integer [] arr1 = {5,6,1,4,7,8};
        Integer [] arr2 = {9,2,4,7,3,8};
        List<Integer> list = new ArrayList<>();
        for (int each: arr1
             ) {
            for (int w:arr2
                 ) {
                if(each==w){
                    list.add(w);
                }
            }

        }
        System.out.println(list);
    }
}
