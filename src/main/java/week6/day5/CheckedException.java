package week6.day5;

public class CheckedException {
    public static void main(String[] args) {
        try{
            throw new Exception();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
