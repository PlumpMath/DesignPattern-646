package Observer.sample01;

public class Pig implements MyObserver {
    @Override
    public void response() {
        System.out.println("我是小猪, 猫咪你别打扰我睡觉~ ");
    }
}
