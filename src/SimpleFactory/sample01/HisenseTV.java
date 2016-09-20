package SimpleFactory.sample01;

public class HisenseTV implements TV{
    @Override
    public void play() {
        System.out.println("欢迎使用 HisenseTV！");
    }
}
