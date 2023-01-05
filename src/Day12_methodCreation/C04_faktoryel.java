package Day12_methodCreation;

public class C04_faktoryel {
    public static void main(String[] args) {
        //verilen bir sayinin 15 ' den kucuk bir pozitif tam sayi oldugunu kontrol edin
        //kucukse bir method olusturup, faktoryel degerini yazdirin

        int input=4;
        if (input<=0 || input>=15) System.out.println("15'ten kucuk bir pozitif tamsayi giriniz");
        faktoryelYazdir(input);


    }
    public static void faktoryelYazdir (int input){
        int faktoryel =1;
            for (int i = 1; i <=input; i++) {
                faktoryel=faktoryel*i;
            }
            System.out.println(faktoryel);
        }

    }
