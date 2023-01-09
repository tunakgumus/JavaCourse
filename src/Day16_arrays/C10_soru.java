package Day16_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C10_soru {
    public static void main(String[] args) {
        //Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        //eski array’e yeni degeri atayin.
        int [] arr = {5,54,4,7,9};
        int eklenecekElement = 5;
        System.out.println(Arrays.toString(method1(arr, eklenecekElement)));

    }
    public static int[] method1 (int[]arr,int sayi){
        int []arr2 = new int[arr.length+1];
        for (int i = 0; i <arr.length ; i++) {
            arr2[i]=arr[i];
            }
            arr2[arr2.length-1]=sayi;
            return arr2;
        }
    public static String[] method2 (String []arr,String str ){
        String []arr2 = new String[arr.length+1];
        for (int i = 0; i <arr.length ; i++) {
            arr2[i]=arr[i];
        }
        arr2[arr2.length-1]=str;
        return arr2;
    }
    }
