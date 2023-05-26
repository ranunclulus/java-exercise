package week6.day5.Interface;

public class Main {
    public static void main(String[] args) {
        Ani ani = new Bird();
        ani.makeSound();
        Human human = new Bird();
        human.run();
        human.makeSound();
    }
}
