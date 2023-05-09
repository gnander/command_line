public class GetUserName {
    public static void main(String[] args) {
        String username = System.getProperty("user.name");
        System.out.println("Current user's username: " + username);
    }
}
