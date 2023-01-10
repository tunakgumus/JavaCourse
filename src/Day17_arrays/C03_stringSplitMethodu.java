package Day17_arrays;

import java.util.Arrays;

public class C03_stringSplitMethodu {
    public static void main(String[] args) {
        String str = "Java her gecen gun guzellesiyor";
        // str'da kac kelime var
        //split methodu istedigimiz stringi istedigimiz ayraci kullanarak ayirmamiza imkan verir
        String [] spaceSplit = str.split(" ");
        System.out.println(Arrays.toString(spaceSplit));
        System.out.println("verilen cumledeki kelime sayisi :" + spaceSplit.length);

        System.out.println(Arrays.toString(str.split("e")));
        System.out.println(Arrays.toString(str.split("")));
    }
}
