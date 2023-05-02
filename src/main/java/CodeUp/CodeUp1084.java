package CodeUp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class CodeUp1084 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int red = sc.nextInt();
        int blue = sc.nextInt();
        int green = sc.nextInt();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < red ; i++) {
            for (int j = 0; j < blue; j++) {
                String line = "";
                for (int k = 0; k < green; k++) {
                    line += i + " " + j + " " + k + "\n";
                }
                bw.write(line);
                bw.flush();
            }
        }
        System.out.println(red * blue * green);
    }
}
