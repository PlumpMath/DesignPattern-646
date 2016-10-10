package Bridge.sample01;

public class MiddlePen extends Pen {
    @Override
    public void draw(String name) {
        String penType = "中号笔";
        this.color.bepaint(penType, name);
    }
}
