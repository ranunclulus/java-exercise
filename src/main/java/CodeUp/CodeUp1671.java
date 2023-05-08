package CodeUp;

import java.util.Scanner;

public class CodeUp1671 {
    public String rockPaperScissors(int myNum, int cumNum) {
        if (myNum == cumNum) return "tie";
        else if (myNum == 0 && cumNum ==1) return "win";
        else if (myNum == 1 && cumNum ==2) return "win";
        else if (myNum == 2 && cumNum ==0) return "win";
        else return "lose";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNum = sc.nextInt();
        int cumNum = sc.nextInt();
        CodeUp1671 codeup = new CodeUp1671();
        System.out.println(codeup.rockPaperScissors(myNum, cumNum));
    }
}
