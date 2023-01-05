package Day10_StringManipulation;

public class C15_forLoopFaktoryel {
    public static void main(String[] args) {
        //5! hesaplayin
        int istenenFaktoryel = 5;
        int faktoryel =1 ;

        for (int i =istenenFaktoryel; i>=2; i--) {
            faktoryel=faktoryel*i;

        }
        System.out.println(faktoryel);
    }
}
