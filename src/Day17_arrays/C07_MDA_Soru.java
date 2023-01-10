package Day17_arrays;

public class C07_MDA_Soru {
    public static void main(String[] args) {
        // Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir
        //method olusturun.
        int [][] arr ={{2,6,8,7},{7,6,2},{7,5,6,3,6}};
        ciftSayilariToplama(arr);

    }
    public static void ciftSayilariToplama (int [][] arr){
        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]%2==0){
                    toplam +=arr[i][j];
                }

            }

        }
        System.out.println(toplam);
    }
}
