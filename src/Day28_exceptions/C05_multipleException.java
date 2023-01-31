package Day28_exceptions;

import java.util.Scanner;

public class C05_multipleException {
    public static void main(String[] args) {
        String str = "Java'da cok fazla exception var";
        int [] arr = {3,5,1,3,2,6,3,6,8,5,2};
        Scanner scan = new Scanner(System.in);
        System.out.println("index girin");

        int index = scan.nextInt();
        System.out.println("Stringde istenen indexteki element : " + str.substring(index,index+1));
        System.out.println("Array'den istenen indexdeki element : " + arr[index]);

        /*
        /1.cozum

        try {
            System.out.println("Stringde istenen indexteki element : " + str.substring(index,index+1));
            System.out.println("Array'den istenen indexdeki element : " + arr[index]);
        }catch ( StringIndexOutOfBoundsException e){
            System.out.println("Istenen index Stringin sinirlari disinda");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Istenen index Arrayin sinirlari disinda");
        }

         */
        // 2.cozum

        /*
        try {
            try {
                System.out.println("Stringde istenen indexteki element : " + str.substring(index,index+1));
                System.out.println("Array'den istenen indexdeki element : " + arr[index]);
            } catch (StringIndexOutOfBoundsException e){
                System.out.println("Istenen index Stringin sinirlari disinda");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Istenen index Arrayin sinirlari disinda");
        }
            */
        //3.cozum


        try {
            System.out.println("Stringde istenen indexteki element : " + str.substring(index, index + 1));
            System.out.println("Array'den istenen indexdeki element : " + arr[index]);
        }catch (RuntimeException e){
            System.out.println("index girislerini kontrol ediniz");
        }

        }
    }

