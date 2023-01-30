package Day27_Overriding;

public class EParent extends DGrandParent{
    @Override
    protected void method1() {
        System.out.println("Parent method1");
    }
    protected void method2() {
        System.out.println("Parent method2");
    }
}
