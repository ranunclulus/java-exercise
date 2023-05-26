package week6.day5.Interface;

public interface Human extends Ani, Shape{

    @Override
    void makeSound();

    @Override
    void run();
}
