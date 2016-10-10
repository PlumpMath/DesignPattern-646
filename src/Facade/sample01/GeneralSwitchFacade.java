package Facade.sample01;

public class GeneralSwitchFacade {
    private AirConditioner ac;
    private Fan fan;
    private Light light;
    private Television tv;

    public GeneralSwitchFacade() {
        ac = new AirConditioner();
        fan = new Fan();
        light = new Light();
        tv = new Television();
    }

    public void on() {
        ac.on();
        fan.on();
        light.on();
        tv.on();
    }

    public void off() {
        ac.off();
        fan.off();
        light.off();
        tv.off();
    }
}
