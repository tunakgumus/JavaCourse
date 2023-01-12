package Day18_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_soru {
    public static void main(String[] args) {
        //Verilen bir arraydeki tekrarlanan ogeleri silip unique yapin
        int [] arr ={4,3,6,7,3,5,3,6,7,3,5,4,6,4,7,7,7};
        List<Integer> benzersizElementler = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
        if(!benzersizElementler.contains(arr[i])) benzersizElementler.add(arr[i]);
        }
        System.out.println(benzersizElementler);

        arr=new int[benzersizElementler.size()];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]= benzersizElementler.get(i);

        }
        System.out.println("yeni arr : " + Arrays.toString(arr));
    }
}
