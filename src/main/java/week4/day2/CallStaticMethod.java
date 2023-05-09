package week4.day2;

public class CallStaticMethod {

    public static void main(String[] args) {
        int h = 4;
        for (int i = 0; i < h; i++) {
            String line = Pyramid2.makeALine(" ", h, i);
            System.out.println(line);
        }
    }
}
