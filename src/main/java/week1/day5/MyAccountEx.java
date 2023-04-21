package week1.day5;

public class MyAccountEx {
    public static void main(String[] args) {
        int sumOfMyAccount = 1000; // 변수는 값을 변경할 수 있고 상수는 값을 변경할 수 없음
        // 변경하지 않는 값이라면 상수로 선언 -> 메모리가 더 효율적이기 때문
        // 상수: Immutable (변경할 수 없는)
        System.out.printf("내 통장에는 %d원이 들어 있습니다", sumOfMyAccount);
    }
}
