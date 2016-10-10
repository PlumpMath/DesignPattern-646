package Decorator.sample01;

public class Car implements Transform {

    public Car() {
        System.out.println("变成汽车");
    }

    @Override
    public void move() {
        System.out.println("在陆地上移动! ");
    }

}
