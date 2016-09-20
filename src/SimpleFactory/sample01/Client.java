package SimpleFactory.sample01;

public class Client {
    public static void main(String args[]) {
        TV tv;
        String brandName = XMLUtilTV.getBrandName();
        try {
            tv = TVFactory.produceTV(brandName);
            tv.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
