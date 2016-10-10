package Adapter.sample02;

public class CipherAdapter extends DataOperation {
    public Caeser cipher;

    public CipherAdapter() {
        cipher = new Caeser();
    }

    @Override
    public String doEncrypt(int key, String ps) {
        return cipher.doEncrypt(key, ps);
    }
}