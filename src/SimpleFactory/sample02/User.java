package SimpleFactory.sample02;

public abstract class User {
    public void sameOperation() {
        System.out.println("全公司都会做的事情是什么呢？");
    }

    public abstract void diffOperation();
}
