package Day17_arrays;

public class C06_MDA {
    public static void main(String[] args) {
        //verilen 2 katlı String bir arrayde
        //istenen metni icerene elementleri yazdiran bir method olusturun
        String[][] arr = {{"Ali", "Zafer" }, {"Betul", "Huseyin", "Hasan" }, {"said" }};
        String arananMetin = "e";
        istenenElementleriYazdir(arr,arananMetin);
    }
    public static void istenenElementleriYazdir (String[][] arr,String str){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j].contains(str)) System.out.print(arr[i][j]+" ");
            }
            
        }
    }
}
