package week4.day1;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "김바보";
        user1.phonenumber = "01000000000";
        user1.age = 24;
        System.out.printf("%s는 성인입니까? %b", user1.name, user1.isAdult());
    }
}
