package Day17_arrays;

import java.util.Arrays;

public class C04_multiDimensionalArrays {
    public static void main(String[] args) {
        int [][] arr = {{1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5}};
        System.out.println(arr.length);
        System.out.println(arr[2].length);
        System.out.println(arr[2][1]);

        System.out.println(Arrays.toString(arr[3]));
        System.out.println(arr[3][0]);

        //MDA arrayin tumunu yazdirmak icin deepToString methodu kullanilir
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr));
    }
}
