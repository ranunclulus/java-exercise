package week2.day2;

import java.sql.SQLOutput;

public class StringEquals {
    public static void main(String[] args) {
        System.out.println("EQUL" == "EQUL");
        // String은 똑같은 게 있으면 하나만 생성하고 두 개 만들지 않음
        // 메모리 주소끼리 비교하기 때문에 같다고 나옴

        String str1 = "GOLD";
        String str2 = "G";
        System.out.println(str1.substring(0, 1).equals(str2));
        // 객체끼리 비교할 땐 해시 주소를 비교함
        // 따라서 스트링끼리 비교할 때는 equals tkdyd
    }
}
