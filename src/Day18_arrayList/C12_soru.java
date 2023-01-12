package Day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C12_soru {
    public static void main(String[] args) {
        //Verilen pozitif bir n tamsayisini alarak, bize ilk n tane tane Fibonacci
        //sayisini bir list olarak donduren bir method olusturun.

        System.out.println(fibonacciList(9));

    }
    public static List fibonacciList (int sayi){
        List<Integer> fibonacci =new ArrayList<>();
        if(sayi<=0) System.out.println("gecersiz giris");
        if(sayi==1) System.out.println("0");
        if(sayi==2) System.out.println("0 1");
        else {
            int sayi1 = 0;
            int sayi2 = 1;
            int sayi3 = 0;
            for (int i = 1; i <=sayi ; i++) {
                sayi3= sayi1+sayi2;
                sayi1=sayi2;
                sayi2=sayi3;
                fibonacci.add(sayi3);
            }



        }
        return fibonacci;
    }
}
