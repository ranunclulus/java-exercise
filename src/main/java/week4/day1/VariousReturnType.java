package week4.day1;

public class VariousReturnType {
    public boolean isAdult() {
        return true;
    }
    public int plus() {
        return 1 + 1;
    }
    public User getUser() {
        return new User();
    }
    public void printHello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        VariousReturnType vs = new VariousReturnType();
        System.out.println(vs.isAdult());
        System.out.println(vs.plus());
        System.out.println(vs.getUser());
        vs.printHello();
    }
}
