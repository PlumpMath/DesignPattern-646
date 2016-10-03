package AbstractFactory.sample01;

public class Client {
    public static void main(String[] args) {
        EFactory factory;
        Television tv;
        AirConditioner ac;
        factory = (EFactory) XMLUtil.getBean();
        tv = factory.produceTelevision();
        tv.play();
        ac = factory.produceAirConditioner();
        ac.changeTemperature();
    }
}
