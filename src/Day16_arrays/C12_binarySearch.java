package Day16_arrays;

import java.util.Arrays;

public class C12_binarySearch {
    public static void main(String[] args) {
        //binary tree Javanin kullandigi ozel bir sıralama methodudur.
        int [] arr ={2,6,9,3,15,1,7};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 3));
    }
}
