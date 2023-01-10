package Day17_arrays;

import java.util.Arrays;

public class C08_MDA_Soru {
    public static void main(String[] args) {
        //Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
        //olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //input : int[][] arr = {{3,4,5}, {2,3,6,7}};
        //output: [5, 7, 11]
        int[][] arr = {{3, 4, 5}, {2, 3, 6, 7}};
        int enKisaArrayLengthi = arr[0].length;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].length<enKisaArrayLengthi){
                enKisaArrayLengthi=arr[i].length;
            }

        }
        int [] arr2= new int[enKisaArrayLengthi];
        int toplam=0;
        for (int i = 0; i <arr2.length ; i++) {
            toplam=0;
            for (int j = 0; j < arr.length ; j++) {
                toplam +=arr[j][i];
                arr2[i]=toplam;
            }

        }
        System.out.println(Arrays.toString(arr2));
    }

    }