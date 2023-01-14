package Day21_staticKeyword;

import java.util.Arrays;

public class C05_passByValueCokluElement {
    public static void main(String[] args) {
        int [] arr ={3,6,9,1,7};
        //bir method olusturup arrayi yollayım, elemanlari uzerinde degisiklik yapalim ve yazdiralim
        elementleriDegistir(arr);

    }
    public static void elementleriDegistir (int [] b){
        b[0]=13;
        b[2]=19;
        System.out.println(Arrays.toString(b));
    }
}
