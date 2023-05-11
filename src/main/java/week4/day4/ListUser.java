package week4.day4;

import java.util.ArrayList;
import java.util.List;

public class ListUser {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        User user1 = new User("김미미", "01022", 19);
        User user2 = new User("김나나", "01033", 21);
        users.add(user1);
        users.add(user2);
        System.out.printf("%s %s %d\n", user1.getName(), user1.getPhoneNumber(), user1.getAge());
        System.out.printf("%s %s %d\n", user2.getName(), user2.getPhoneNumber(), user2.getAge());
        for(User user : users) {
            System.out.printf("%s %s %d\n", user.getName(), user.getPhoneNumber(), user.getAge());
        }
    }
}
