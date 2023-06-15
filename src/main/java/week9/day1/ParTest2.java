package week9.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ParTest2 {
    public boolean solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        // 검사를 위해 필요한 Stack 정의
        Stack<Character> charStack = new Stack<>();

        // 문자열 길이만큼 순회
        for (int i = 0; i < input.length(); i++) {
            char next = input.charAt(i);
            // 어차피 괄호는 대 -> 중 -> 소 순서로 열리고 stack에서 꺼내기 때문에 소 -> 중 -> 대 순서로 닫히는지 확인 가능
            // 무엇이든 여는 괄호라면 스택에 넣기
            if (next == '(' || next == '{' || next == '[') charStack.push(next);
            // 닫는 괄호를 만났을 때
            else {
                // pop 할 게 없으면
                if (charStack.isEmpty()) return false;
                // 아니라면
                char top = charStack.pop();

                // 들어온 건 닫는 소괄호 && 열린 건 소괄호가 아닐 때 실패
                if(next == ')' && top != '(') return false;
                // 들어온 건 닫는 중괄호 && 열린 건 중괄호가 아닐 때 실패
                else if (next == '}' && top != '{') return false;
                // 들어온 건 닫는 대괄호 && 열린 건 대괄호가 아닐 때 실패
                else if (next == ']' && top != '[') return false;
            }
        }
        // 순회 이후 스택이 비었는지 확인
        if(charStack.isEmpty()) return true;
        // 아니라면 false 반환
        return false;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new ParTest2().solution());
    }
}
