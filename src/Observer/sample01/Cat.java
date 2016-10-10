package Observer.sample01;

public class Cat extends MySubject {
    @Override
    public void cry() {
        System.out.println("喵~喵~");
        for (Object obs : observers) {
            ((MyObserver) obs).response();
        }
    }
}
