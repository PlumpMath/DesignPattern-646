package FactoryMethod.sample01;

public class HaierTV implements TV {
    @Override
    public void play() {
        System.out.println("欢迎使用 Haier !");
    }
}
