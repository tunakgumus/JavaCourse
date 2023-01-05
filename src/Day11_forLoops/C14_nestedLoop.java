package Day11_forLoops;

public class C14_nestedLoop {
    public static void main(String[] args) {
        // 4 lü carpim tablosu olusturun
        int carpim = 4;
        for (int i = 1; i <=carpim ; i++) {
            for (int j = 1; j <=carpim; j++) {
                System.out.print((i)+"*"+ (j)+" = " + i*j + "\n");

            }
            System.out.print("");

        }
    }
}
