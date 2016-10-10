package Observer.sample01;

public class Dog implements MyObserver {
    @Override
    public void response() {
        System.out.println("我是狗狗, 猫咪你好~ ");
    }
}
