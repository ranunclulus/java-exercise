package CodeUp;

import java.util.Scanner;

public class CodeUp1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;
        boolean more = true;
        while(more) {
            answer = 0;
            while(number > 0) {
                answer += number % 10;
                number = number / 10;
            }
            number = answer;
            if (answer < 10) {
                more = false;
            }
        }
        System.out.println(answer);
    }
}
