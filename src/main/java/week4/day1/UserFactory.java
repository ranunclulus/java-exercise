package week4.day1;

public class UserFactory {
    public User getAdaultUser() {
        User user = new User();
        user.age = 34;
        return user;
    }
}
