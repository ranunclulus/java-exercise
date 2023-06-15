package week9.day4;

public class AlphaToInteger {
    // 숫자로만 이루어진 value 문자열에 대해
    // 각 글자를 숫자 데이터로 해석한 뒤
    // - 48 하면 숫자가 된다
    public int atoi(String value) {
        int result = 0;
        int i = 0;
        // TODO 첫 번째 문자를 사전에 확인
        boolean negative = false;
        if (value.charAt(i) == '-') {
            negative = true;
            // 두 번째 글자부터 확인
            i++;
        }
        // TODO 문자열을 한 글자씩 확인
        for (; i < value.length(); i++) {
            // TODO 자릿수 변환
            result *= 10;
            // TODO 글자를 숫자로 반환
            result += value.charAt(i) - '0';
        }
        if (negative) result  *= -1;
        return result;
    }
    public static void main(String[] args) {
        AlphaToInteger alphaToInteger = new AlphaToInteger();
        System.out.println(alphaToInteger.atoi("12345"));
        System.out.println(alphaToInteger.atoi("-12345"));
    }
}
