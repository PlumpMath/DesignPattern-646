package Proxy.DynamicProxy;

public class RealSubjectB implements AbstractSubject {
    @Override
    public void request() {
        System.out.println("RealSubjectB");
    }
}
