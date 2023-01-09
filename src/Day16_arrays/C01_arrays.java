package Day16_arrays;

import java.util.Arrays;

public class C01_arrays {
    public static void main(String[] args) {
        String [] arr1 = new String[4];
        int [] arr2 = {3,4,5,6,7,8};
        System.out.println(arr2[2]);
        System.out.println(arr1[2]);

        arr2[2]=15;
        arr2[0]=0;
        System.out.println(arr2);

        System.out.println(Arrays.toString(arr2));
    }
}
