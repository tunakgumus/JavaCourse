package Day19_arrayList_forEachLoop;

public class C02_forEachLoop {
    public static void main(String[] args) {
        int [] arr ={2,4,6,8,1};
        int toplam=0;
        //bu arrayin tum elementlerini yazdirin
        for (int each : arr
             ) {
            System.out.print(each + " ");
            toplam +=each;
        }
        System.out.println("\nelementlerin toplami : " + toplam);

        //tum sayilarin karelerini toplami
        toplam=0;
        for (int each:arr
             ) {
            toplam += each*each;
        }
        System.out.println(toplam);
    }
}
