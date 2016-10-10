package Proxy.DynamicProxy;

public class RealSubjectA implements AbstractSubject {
    @Override
    public void request() {
        System.out.println("RealSubjectA");
    }
}
