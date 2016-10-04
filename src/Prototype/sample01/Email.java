package Prototype.sample01;

public class Email implements Cloneable {
    private Attachment attachment = null;

    public Email() {
        this.attachment = new Attachment();
    }

    public Object clone() {
        Email clone = null;
        try {
            clone = (Email) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone Failure!");
        }
        return clone;
    }

    public Attachment getAttachment() {
        return attachment;
    }
}
