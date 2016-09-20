package SimpleFactory.sample02;

public class UserDAO {
    public int findPermission(String usreName, String userPassword) {
        if ("zhangsan" == usreName && "123456" == userPassword) {
            return 2;
        } else {
            return -1;
        }
    }
}
