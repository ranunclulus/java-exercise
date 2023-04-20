package week1.day4;

public class VariableEx {
    public static void main(String[] args) {
        int iVal;
        iVal = 0;
        PrintHello printHello; // 변수 선언
        printHello = new PrintHello(); // new를 이용해 인스턴스화 및 초기화
        System.out.println(iVal);
        printHello.print();
    }
}
