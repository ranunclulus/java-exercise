package week9.day4;

public class IntegerToAlpha {
    public String itoa(int value){
        StringBuilder answerBuilder = new StringBuilder();
        String result = "";
        // 음수라면
        if (value < 0) {
            value *= -1;
            result += "-";
        }
        // TODO value가 0보다 큰 동안
        while(value > 0) {
            // TODO valueㄹㄹ 10으로 나눈 나머지를 문자로 변환
            char digitChar = (char)(value % 10 + '0');
            answerBuilder.append(digitChar);
            // TODO value 나누기 10
            value /= 10;
        }
        result += answerBuilder.reverse();
        return result;
    }
    public static void main(String[] args) {
        IntegerToAlpha integerToAlpha = new IntegerToAlpha();
        System.out.println(integerToAlpha.itoa(1234));
        System.out.println(integerToAlpha.itoa(-1234));
    }
}
