package week3.day3;

public class Factor {
    public static void main(String[] args) {
        int n = 36;
        for (int i = 1; i <= n ; i++) {
            System.out.printf("%d %% %d = %d\n", n, i, n % i);

        }
    }
}
