package week1.day5;

public class SpaceInvadersMember {
    int location; // 멤버변수로 선언
    public void moveLeft() {
        location = location - 1;
        System.out.printf("moveLeft: %d\n", location);
    }
    public void meveRight() {
        location = location + 1;
        System.out.printf("moveRight: %d\n", location);
    }
    public static void main(String[] args) {
        SpaceInvadersMember sp = new SpaceInvadersMember();
        sp.moveLeft();
        sp.moveLeft();
        sp.meveRight();
        sp.meveRight();
        sp.moveLeft();
        sp.meveRight();
        sp.meveRight();
        System.out.printf("최종 위치: %d", sp.location); // 멤버변수 접근: 변수명.멤버변수
    }
}
