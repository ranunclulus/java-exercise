package week2.day2;

public class StringSplit {
    public static void main(String[] args) {
        String str = "10 3 19 28 7 488";
        String[] strArr = str.split(" ");
        for (int i = 0; i < 6; i ++){
            System.out.println(strArr[i]);
        }
    }
}
