package Day17_arrays;

public class C10_MDA_Soru {
    public static void main(String[] args) {
        //Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir
        //method olusturun.
        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        System.out.println(arrayTumElementlerCarpim(arr));
    }
    public static int arrayTumElementlerCarpim (int [][]arr){
        int carpim=1;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                carpim *=arr[i][j];

            }

        }
        return carpim;
    }
}
