package week9.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ParTest {
    public boolean solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        Stack<Character> charStack = new Stack<>();

        // 문자열 길이만큼 순회
        for (int i = 0; i < input.length(); i++) {
            char next = input.charAt(i);
            // 여는 괄호를 만날 때
            if(next == '(') {
                charStack.push(next);
            }
            // 닫는 괄호를 만날 때
            else if (next == ')') {
                // pop 할 게 없다면 검사 실패
                if (charStack.isEmpty()) return false;

                // 아니라면 pop
                char top = charStack.pop();
                if (top != '(') return false;
            }
        }
        if (charStack.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        System.out.println((new ParTest()).solution());
    }
}
