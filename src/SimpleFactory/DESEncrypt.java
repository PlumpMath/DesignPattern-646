package SimpleFactory;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class DESEncrypt {
    public static void main(String args[]) {
        String encodeStringBegin = "Sunny Day"; // 要加密的明文
        String encodeStringEnd = null; // 加密后的密文
        String decodeString = null; // 密文解密后得到明文
        String cipherType = "DESede"; // 加密算法类型，可设置为 DES、DESede、AES 等字符串
        int keyLength = 112;
        try {
            // 获取密钥生成器
            KeyGenerator keyGen = KeyGenerator.getInstance(cipherType);
            // 初始化密钥生成器，不同的加密算法其密钥长度可能不同
            keyGen.init(keyLength);
            // 生成密钥
            SecretKey key = keyGen.generateKey();
            // 得到密钥字节码
            byte[] keyByte = key.getEncoded();
            // 输出密钥的字节码
            System.out.println("密钥是：");
            for (int i = 0; i < keyByte.length; i++) {
                System.out.print(keyByte[i] + ",");
            }

            System.out.println("");

            // 创建密码器
            Cipher cp = Cipher.getInstance(cipherType);
            cp.init(Cipher.ENCRYPT_MODE, key);

            System.out.println("要加密的字符串是：" + encodeStringBegin);
            byte[] encodeStringByteBegin = encodeStringBegin.getBytes("UTF8");
            System.out.println("要加密的字符串对应的字节码是：");
            for (int i = 0; i < encodeStringByteBegin.length; i++) {
                System.out.print(encodeStringByteBegin[i] + ",");
            }

            System.out.println("");

            // 开始加密
            byte[] encodeStringByteEnd = cp.doFinal(encodeStringByteBegin);
            System.out.println("加密后字符串对应的字节码是：");
            for (int i = 0; i < encodeStringByteEnd.length; i++) {
                System.out.print(encodeStringByteEnd[i] + ",");
            }
            System.out.println("");
            encodeStringEnd = new String(encodeStringByteEnd);
            System.out.println("加密后的字符串是：" + encodeStringEnd);

            // 重新初始化解码器
            cp.init(Cipher.DECRYPT_MODE, key);
            // 开始解密
            byte[] decodeStringByteEnd = cp.doFinal(encodeStringByteEnd);
            System.out.println("解密后的字符串对应的字节码是：");
            for (int i = 0; i < decodeStringByteEnd.length; i++) {
                System.out.print(decodeStringByteEnd[i] + ",");
            }
            System.out.println("");
            decodeString = new String(decodeStringByteEnd);
            System.out.println("解密后的字符串是：" + decodeString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
