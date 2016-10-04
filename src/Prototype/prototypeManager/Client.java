package Prototype.prototypeManager;

public class Client {
    public static void main(String[] args) {
        PrototypeManager prototypeManager = new PrototypeManager();

        MyColor obj1 = (MyColor) prototypeManager.getColor("red");
        obj1.display();

        MyColor obj2 = (MyColor) prototypeManager.getColor("red");
        obj2.display();

        System.out.println(obj1 == obj2);
    }
}
