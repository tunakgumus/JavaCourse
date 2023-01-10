package Day17_arrays;

import java.util.Arrays;

public class C01_binarySearch {
    public static void main(String[] args) {
        int [] arr = {2,8,4,1,9,3,6};
        System.out.println(Arrays.binarySearch(arr,2));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,2));

        //olmayan bir element aradigimizda ne olur
        System.out.println(Arrays.binarySearch(arr,0));
    }
}
