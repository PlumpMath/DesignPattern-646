package Prototype.prototypeManager;

public class Blue implements MyColor {

    @Override
    public Object clone() {
        Blue r = null;
        try {
            r = (Blue) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return r;
    }

    @Override
    public void display() {
        System.out.println("This is Blue!");
    }
}
