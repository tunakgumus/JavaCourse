package Day16_arrays;

public class C05_soru {
    public static void main(String[] args) {
        //Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        //method yaziniz

        int [] toplanacakArray={3,-5,4,6,-1,8};
        System.out.println(method1(toplanacakArray));
    }
    public static int method1 (int[] arr){
        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>0){
                toplam +=arr[i];
            }
        }
        return toplam;
    }
}
