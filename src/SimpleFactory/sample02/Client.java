package SimpleFactory.sample02;

public class Client {
    public static void main(String args[]) {
        User user;
        UserDAO userDAO = new UserDAO();
        int permission = userDAO.findPermission("zhangshan", "123456");
        user = UserFactory.getUser(permission);
        user.sameOperation();
        user.diffOperation();
    }
}
