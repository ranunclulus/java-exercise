package week4.day4;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User("김미미", "01000000000", 19);
        System.out.println(user1.getName());
        user1.setName("김나나");
        System.out.println(user1.getName());
    }
}
