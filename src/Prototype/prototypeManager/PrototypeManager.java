package Prototype.prototypeManager;

import java.util.Hashtable;

public class PrototypeManager {
    private Hashtable hashtable = new Hashtable();

    public PrototypeManager() {
        hashtable.put("red", new Red());
        hashtable.put("blue", new Blue());
    }

    public void addColor(String key, MyColor obj) {
        hashtable.put(key, obj);
    }

    public MyColor getColor(String key) {
        return (MyColor) ((MyColor) hashtable.get(key)).clone();
    }
}
