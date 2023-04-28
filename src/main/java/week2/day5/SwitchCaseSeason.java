package week2.day5;

public class SwitchCaseSeason {
    public static void main(String[] args) {
        int month = 3;
        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("fall");
                break;
            default:
                System.out.println("해당하는 게절이 없습니다");
        }
    }
}
