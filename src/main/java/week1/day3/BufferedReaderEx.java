package week1.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferedReaderEx {
    public void readLine() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        System.out.println("line1 = " + br.readLine());
        System.out.println("line2 = " + br.readLine());
    }

    public void plusTwoNumbers() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in); //글자로 한 글자씩 읽음
        BufferedReader br = new BufferedReader(is);

        System.out.println(br.readLine() + br.readLine()); //readLine은 string으로만 읽어온다
    }
}
