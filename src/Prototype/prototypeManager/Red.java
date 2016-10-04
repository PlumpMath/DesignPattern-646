package Prototype.prototypeManager;

public class Red implements MyColor {

    @Override
    public Object clone() {
        Red r = null;
        try {
            r = (Red) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return r;
    }

    @Override
    public void display() {
        System.out.println("This is Red!");
    }
}
