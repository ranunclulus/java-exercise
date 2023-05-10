package week4.day3;

public class DrawDiamond {
    public static String getRepeatedSymbol(String symbol, int repeatNum) {
        return symbol.repeat(repeatNum);
    }

    public static String getNoRepeatedSymbol(String symbol, int repeatNum) {
        String result = "";
        for (int i = 0; i < repeatNum; i++) {
            result += symbol;
        }
        return result;
    }

    public static void main(String[] args) {
        int h = 7;
        int pivot = h / 2;
        for (int i = 0; i < h; i++) {
            if(i <= pivot) {
                //System.out.printf("%d %d\n", pivot - i, 2 * i + 1);
                System.out.printf("%s%s\n", getRepeatedSymbol(" ", pivot - i), getRepeatedSymbol("*", 2 * i + 1));
            } else {
                //System.out.printf("%d %d\n", i - pivot, -2 * i + 2 * pivot + h);
                System.out.printf("%s%s\n", getRepeatedSymbol(" ", i - pivot), getRepeatedSymbol("*", -2 * i + 2 * pivot + h));
            }
        }
        for (int i = 0; i < h; i++) {
            if(i <= pivot) {
                //System.out.printf("%d %d\n", pivot - i, 2 * i + 1);
                System.out.printf("%s%s\n", getNoRepeatedSymbol(" ", pivot - i), getNoRepeatedSymbol("*", 2 * i + 1));
            } else {
                //System.out.printf("%d %d\n", i - pivot, -2 * i + 2 * pivot + h);
                System.out.printf("%s%s\n", getNoRepeatedSymbol(" ", i - pivot), getNoRepeatedSymbol("*", -2 * i + 2 * pivot + h));
            }
        }
    }
}
