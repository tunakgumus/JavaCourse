package Day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_arraydenListYapma {
    public static void main(String[] args) {
        Integer [] arr ={2,3,4,6,3,4,6,1,8,5,4};
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            list1.add(arr[i]);
        }
        System.out.println("List ile tasinan liste : "+ list1);

        System.out.println("===========2.Method=============");
        List<Integer> list2 = Arrays.asList(arr);
        System.out.println(list2);
        //list2.add(6);

        arr [0]=10;
        System.out.println(Arrays.toString(arr));
        System.out.println(list2);


    }
}
