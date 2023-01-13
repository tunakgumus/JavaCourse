package Day19_arrayList_forEachLoop;

public class C05_soru {
    public static void main(String[] args) {
        //Verilen int array’deki her elementin karelerini alip, karelerinin toplamini
        //yazdiran bir method olusturun.
        int [] arr ={2,3,4,6,3,4,6,1,8,5,4};
        karelerToplami(arr);

    }
    public static void karelerToplami(int [] arr){
        int toplam=0;
        for (int each:arr
             ) {
            toplam +=each*each;
        }
        System.out.println("Kareler toplami : " + toplam);
    }
}
