package Day11_forLoops;

public class C15_nestedLoop {
    public static void main(String[] args) {
        // input olarak verilen kenar uzunluklarina göre asagidaki sekli cizdirin
        /*
        * * * * * * * *
        * * * * * * * *
        * * * * * * * *
        * * * * * * * *
        * * * * * * * *
         */
        int kisaKenar = 8;
        int uzunKenar = 12;
        for (int i = 1; i <=kisaKenar ; i++) {
            for (int j = 1; j <=uzunKenar; j++) {
                System.out.print("* ");
            }
            System.out.println("");

        }
    }
}
