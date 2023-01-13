package Day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_forEachLoop {
    public static void main(String[] args) {
        Integer [] arr ={2,3,4,6,3,4,6,1,8,5,4};
        List<Integer> list = new ArrayList<>();

        //arraydeki elementleri liste ekleyelim

        for (int each:arr
             ) {
            list.add(each);
        }
        System.out.println(list);

        //arraydeki cift sayilari olusturdugumus bir list e tasiyalim
        List<Integer> list2 =new ArrayList<>();

        for (int each:arr
             ) {
            if(each%2==0){
                list2.add(each);
            }
        }
        System.out.println(list2);
    }
}
