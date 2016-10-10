package Proxy.sample01;

public class RealPermission implements AbstractPermission {
    @Override
    public void modifyUserInfo() {
        System.out.println("修改用户信息! ");
    }

    @Override
    public void viewNote() {
    }

    @Override
    public void publishNote() {
        System.out.println("发布新笔记! ");
    }

    @Override
    public void modifyNote() {
        System.out.println("修改笔记内容! ");
    }

    @Override
    public void setLevel(int level) {
    }
}
