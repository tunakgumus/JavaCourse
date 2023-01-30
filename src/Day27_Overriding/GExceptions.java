package Day27_Overriding;

public class GExceptions {
    public static void main(String[] args) {
        int a = 20;
        int b = 0;
        System.out.println("iki sayinin bolumu : " + a/b);

        if(b!=0){
            System.out.println("iki sayinin bolumu : " + a/b);
        }else System.out.println("Bolecek sayi 0 olamaz");

    }
}
