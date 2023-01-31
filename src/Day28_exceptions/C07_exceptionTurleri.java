package Day28_exceptions;

public class C07_exceptionTurleri {
    public static void main(String[] args) {
        String str = "234";
        System.out.println(Integer.parseInt(str) + 5);

        Object sayiObj = str;
        Integer sayiInt = (Integer) sayiObj;

        System.out.println(sayiInt);
    }
}
