package Day08_StringManipulation;

import java.util.Locale;

public class C02_ToUpperCaseLocale {
    public static void main(String[] args) {
        String str = "JAVA CANDIR";
        System.out.println(str.toLowerCase());
        str = str.toLowerCase(Locale.forLanguageTag("Tr"));
        System.out.println(str);

        String str2 = "sevgi güçlüdür";
         System.out.println(str2.toUpperCase());
    }
}
