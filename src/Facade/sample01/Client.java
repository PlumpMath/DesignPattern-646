package Facade.sample01;

public class Client {
    public static void main(String[] args) {
        GeneralSwitchFacade gsf = new GeneralSwitchFacade();
        gsf.on();
        gsf.off();
    }
}
