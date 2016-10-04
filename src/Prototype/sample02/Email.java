package Prototype.sample02;

import java.io.*;

public class Email implements Serializable {
    private Attachment attachment = null;

    public Email() {
        this.attachment = new Attachment();
    }

    public Object deepClone() throws IOException, ClassNotFoundException {
        // 将对象写入流中
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        // 将对象从流中取出
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return objectInputStream.readObject();
    }

    public Attachment getAttachment() {
        return this.attachment;
    }
}
