package Day16_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C08_soru {
    public static void main(String[] args) {
        //Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
        //donduren bir method olusturun.
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen arrayinizin boyutunu giriniz");
        int sayi = scan.nextInt();
        System.out.println(Arrays.toString(method1(sayi)));


    }
    public static int[] method1 (int sayi){
        int [] arr =new int [sayi];
        for (int i = 0; i <=sayi-1 ; i++) {
            Scanner scan =new Scanner(System.in);
            System.out.println("Lutfen arrayin" + i + ". elementi yaziniz");
            arr[i]=scan.nextInt();
        }
        return arr;

    }
}
