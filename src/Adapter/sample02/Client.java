package Adapter.sample02;

public class Client {
    public static void main(String[] args) {
        DataOperation dao = (DataOperation) XMLUtil.getBean();
        dao.setPassword("AndyZhu");
        String ps = dao.getPassword();
        String es = dao.doEncrypt(6, ps);
        System.out.println("加密前的密码是: " + ps);
        System.out.println("加密后的密码是: " + es);
    }
}
