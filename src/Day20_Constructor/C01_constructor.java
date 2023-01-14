package Day20_Constructor;

import Day19_arrayList_forEachLoop.Toyota;

public class C01_constructor {
    public static void main(String[] args) {
        Car car1 = new Car();
        Toyota toyota = new Toyota();

        System.out.println(car1);
        System.out.println(toyota);
        car1.marka="Audi";
        car1.model="A4";
        car1.yil=2020;
        car1.km=20000;
        car1.renk="Siyah";
        System.out.println(car1);
    }
}
