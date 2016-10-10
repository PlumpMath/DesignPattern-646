package Decorator.sample02;

public class Client {
    public static void main(String[] args) {
        String password = "AndyZhu";
        String cpassword;
        Cipher sc, ac, cc;
        sc = new SimpleCipher();
        cpassword = sc.encrypt(password);
        System.out.println(cpassword);

        cc = new ComplexCipher(sc);
        cpassword = cc.encrypt(password);
        System.out.println(cpassword);

        ac = new AdvancedCipher(sc);
        cpassword = ac.encrypt(password);
        System.out.println(cpassword);
    }
}
