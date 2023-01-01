package Day07_Ternary_SwitchStatements;

public class C11_SwitchStatement {
    public static void main(String[] args) {
        int sayi1= 10;
        int sayi2 = 20 ;
        char islem = '*';

        if (islem=='+') System.out.println("sayilarin toplamı " + (sayi2+sayi1));
        else if (islem=='-') System.out.println("sayilarin farki " + (sayi2-sayi1));
        else if (islem=='*') System.out.println("sayilarin carpimi " + sayi2*sayi1);
        else if (islem=='/') System.out.println("sayilarin bolumu " + sayi2/sayi1);
        else System.out.println("yanlış islem");

        //switch ile yapalım
        switch (islem){
            case '+':
                System.out.println("sayilarin toplamı " + (sayi2+sayi1));
                break;
            case '-':
                System.out.println("sayilarin farki " + (sayi2-sayi1));
                break;
            case '*':
                System.out.println("sayilarin carpimi " + sayi2*sayi1);
                break;
            case '/':
                System.out.println("sayilarin bolumu " + sayi2/sayi1);
                break;
            default:
                System.out.println("yanlis islem ");
        }
    }
}
