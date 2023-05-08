package week4.day1;

public class UserFactoryTest {
    public static void main(String[] args) {
        UserFactory userFactory = new UserFactory();
        User user = userFactory.getAdaultUser();
        System.out.println(user.age);
    }
}
