package Day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_soru {
    public static void main(String[] args) {
        //Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
        //elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.
        Integer [] arr ={2,3,4,6,3,4,6,1,8,5,4};
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int each:arr
             ) {
            list.add(each);
        }
        for (int each:arr
             ) {
            if(!list2.contains(each)){
                list2.add(each);
            }
        }
        arr =list2.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));
    }
    }
