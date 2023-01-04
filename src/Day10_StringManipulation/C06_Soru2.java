package Day10_StringManipulation;

public class C06_Soru2 {
    public static void main(String[] args) {
        // Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        //input1 : “15.30 €” , input2 : “11.40 €”
        //output : 36.70 €
        String input1 = "15.30 €";
        String input2 = "11.40 €";
        input1 = input1.replaceAll(" €","");
        input2 = input2.replaceAll(" €","");


        System.out.println(input1);
        System.out.println(input2);

        double fiyat = Double.parseDouble(input1);
        double fiyat2= Double.parseDouble(input2);

        double toplam = fiyat+fiyat2;
        System.out.println(toplam);
    }
}
