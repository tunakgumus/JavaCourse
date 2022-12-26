package Day02_variables_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Isminizi yaziniz");
        String GirilenIsim = scan.nextLine();
        System.out.println(GirilenIsim.toUpperCase());
    }}
