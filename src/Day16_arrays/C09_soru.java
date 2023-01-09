package Day16_arrays;

public class C09_soru {
    public static void main(String[] args) {
        //Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
        //olusturun.
        String[] arr = {"hasan", "hüseyin", "ali", "ahmet", "mehmet"};
        method1(arr);
    }

    public static void method1(String[] arr) {
        String uzunStr = "";
        String kisaStr =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > uzunStr.length()) {
                uzunStr = arr[i];
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()<kisaStr.length()){
                kisaStr=arr[i];
            }
        }
        System.out.println("Stringin en kisa kelimesi: " + kisaStr + ", en uzun kelimesi: " + uzunStr);

    }
}

