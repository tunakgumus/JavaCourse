package Day16_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_arrays {
    public static void main(String[] args) {
        //verilen bir string arrayin tüm elementlerini yazdirin
        String [] isimler ={"Huseyin","Yusuf","Mehmet","Akile","Said"};
        System.out.println(Arrays.toString(isimler));

        for (int i = 0; i <isimler.length ; i++) {
            System.out.print(isimler[i] + " ");
        }
    }
}
