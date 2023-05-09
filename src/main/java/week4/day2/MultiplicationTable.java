package week4.day2;

public class MultiplicationTable {
    public static void printDan(String multiplesSymbol, int dan) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d %s %d = %d\n", dan, multiplesSymbol, i, dan * i);
        }
        System.out.println("------------");
    }
    public static void main(String[] args) {
        printDan("*",2);
        printDan("x",9);
    }
}
