package Day30_interfaces_Iterartor;

public class M01_childOfInterface implements I01_interface,I02_interface{
    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }

    @Override
    public void method4() {

    }

    @Override
    public void method5() {

    }

    @Override
    public int method6() {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(I01_interface.SAYI2);
    }
}
