package Observer.sample01;

public class Mouse implements MyObserver {
    @Override
    public void response() {
        System.out.println("我是老鼠, 喵咪来了, 快跑快跑~ ");
    }
}
