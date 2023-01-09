package Day16_arrays;

import java.util.Arrays;

public class C03_soru {
    public static void main(String[] args) {
        //verilen bir arraydaki degerleri 5 arttırın
        int []arr ={2,4,6,8};
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=arr[i]+5;
        }
        System.out.println(Arrays.toString(arr));
    }
}
