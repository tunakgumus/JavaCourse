package Day29_finalAbstractClasses;

public class EChild extends DParent {


    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    public static void main(String[] args) {
        EChild chld1 = new EChild();
        chld1.method1();
        chld1.method2();
        chld1.method3();

        DParent chld2 = new EChild();
        chld2.method1();
        chld2.method2();
        chld2.method3();
    }
}

