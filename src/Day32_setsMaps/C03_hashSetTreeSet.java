package Day32_setsMaps;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C03_hashSetTreeSet {
    public static void main(String[] args) {
        Random rnd = new Random();

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        int sayi;

        Long hashBaslangic = System.currentTimeMillis();
        for (int i = 0; i <=100000 ; i++) {
        sayi= rnd.nextInt(1000000);
        hashSet.add(sayi);
        }
        Long hashBitis = System.currentTimeMillis();

        Long treeBaslangic = System.currentTimeMillis();
        for (int i = 0; i <=100000 ; i++) {
            sayi= rnd.nextInt(1000000);
            treeSet.add(sayi);
        }
        Long treeBitis = System.currentTimeMillis();

        System.out.println("Süre1 = " + (hashBitis-hashBaslangic)
                            + "\nSüre2 = " + (treeBitis-treeBaslangic));
    }
}
