package Day31_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C06_arraydekiTekrarlardanKurtulma {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6,6,4,5,9,8,5,4,7,1,2};

        Set<Integer> arrSet = new HashSet<>();

        for (int each: arr
             ) {
            arrSet.add(each);
        }

        arr = new int [arrSet.size()];
        int index = 0;

        for (int each: arrSet
             ) {
            arr[index]=each;
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
