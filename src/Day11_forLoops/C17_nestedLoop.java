package Day11_forLoops;

public class C17_nestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 3; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println("");

        }
    }
}
