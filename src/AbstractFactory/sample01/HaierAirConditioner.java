package AbstractFactory.sample01;

public class HaierAirConditioner implements AirConditioner {
    @Override
    public void changeTemperature() {
        System.out.println("欢迎使用 HaierAirConditioner !");
    }
}
