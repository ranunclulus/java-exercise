package week4.day1;

public class SpaceIncadersTest {
    public static void main(String[] args) {
        SpaceInvaders spaceInvaders = new SpaceInvaders();
        spaceInvaders.moveLeft();
        System.out.println(spaceInvaders.location);
        spaceInvaders.moveRight();
        System.out.println(spaceInvaders.location);
    }
}
