package Day08_StringManipulation;

import javax.sound.midi.Soundbank;
import java.util.logging.SocketHandler;

public class C05_CharAt {
    public static void main(String[] args) {
        String str = "Java guzeldir";
        System.out.println(str.charAt(5));

        //sondan 4.karakteri büyük harf olarak verin

        System.out.println(str.toUpperCase().charAt(13-4));
    }
}
