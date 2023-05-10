package week4.day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RightTrianglePrinter {
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", "", "*".repeat(i));
    }

    public void printToFile(String[] lines) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./aaa.txt"));
        for (int i = 0; i < lines.length; i++) {
            bufferedWriter.append(lines[i]);
            bufferedWriter.flush();
        }
        bufferedWriter.close();
    }

    public void printShape(int h) throws IOException {
        String[] lines = new String[h];
        for (int i = 0; i < h; i++) {
            lines[i] = makeALine(h, i + 1);
        }

        printConsole(lines);
        printToFile(lines);
    }

    //모양 출력하기
    public void printConsole(String[] lines) {
        for (int i = 0; i < lines.length; i++) {
            System.out.printf("%s", lines[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        RightTrianglePrinter rightTrianglePrinter = new RightTrianglePrinter();
        rightTrianglePrinter.printShape(5);
    }
}
