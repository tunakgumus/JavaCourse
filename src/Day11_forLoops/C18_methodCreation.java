package Day11_forLoops;

public class C18_methodCreation {
    public static void main(String[] args) {
        faktoryelyazdir(8);


    }

    private static void faktoryelyazdir(int i) {
        int carpim = 1;
        for (int j = 1; j <=i ; j++) {

            carpim=carpim*j;
        }
        System.out.println(carpim);

    }
}
