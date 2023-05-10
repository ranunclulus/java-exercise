package week4.day3.inter;

import java.io.IOException;

public class HelloPrinter {
    Printer printer;
    // 파일에도 저장하고 싶고 출력도 하고 싶음

    public HelloPrinter(Printer printer){
        this.printer = printer;
    }
    public void repeatMessage(int n, String message) throws IOException {
        for (int i = 0; i < n; i++) {
            printer.print(message);
        }
    }

    public static void main(String[] args) throws IOException {
        HelloPrinter hp = new HelloPrinter(new FilePrinter());
        hp.repeatMessage(5, "Hi");
    }
}
