package Day28_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_checkedExceptions {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("src/Day28_exceptions/metin.txt");

    }
}
