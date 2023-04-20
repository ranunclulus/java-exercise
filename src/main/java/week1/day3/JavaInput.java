package week1.day3;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class JavaInput {
    public void readChar() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        System.out.println(is.read());
    }
    public void readTwoChars() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        int asciiCode1 = is.read();
        int asciiCOde2 = is.read();
        System.out.println(asciiCode1);
        System.out.println(asciiCOde2);

    }
}
