package Day16_arrays;

import java.util.Arrays;

public class C11_sort {
    public static void main(String[] args) {
        //verilen bir arrayi Natural Ordera göre siralayip yazdirin
        String [] isimler ={"Hüseyin","Yusuf","Mehmet","Akile","Said"};
        System.out.println(Arrays.toString(isimler));
        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));


    }
}
