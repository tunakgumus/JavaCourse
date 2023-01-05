package Day12_methodCreation;

public class C09_fibonacciDizimi {
    public static void main(String[] args) {
        //Verilen sayi adedince fibonacci serisinden sayilar yazdiran bir method olusturun
        fibonacciYazdir(9);

    }
    public static void fibonacciYazdir (int sayi){
        if(sayi<=0) System.out.println("gecersiz giris");
        if(sayi==1) System.out.println("0");
        if(sayi==2) System.out.println("0 1");
        else {
            int sayi1 = 0;
            int sayi2 = 1;
            int sayi3 = 0;
            for (int i = 1; i <=sayi ; i++) {
                System.out.print(sayi1 + sayi2 +" ");
                sayi3= sayi1+sayi2;
                sayi1=sayi2;
                sayi2=sayi3;
            }



        }
    }

}
