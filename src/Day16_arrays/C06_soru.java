package Day16_arrays;

import java.util.Arrays;

public class C06_soru {
    public static void main(String[] args) {
        //Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
        //basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
        //Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]

        int [] arr= {4,5,6,7};
        System.out.println(Arrays.toString(elemenKaydirma(arr)));


    }
    public static int[] elemenKaydirma (int [] arr){
        int []arr2=new int[1];
        arr2[0]=arr[arr.length - 1];
        for (int i =arr.length-2;i>=0 ; i--) {
          arr[i+1]=arr[i];
        }
        arr[0]=arr2[0];

        return arr;
    }
}
