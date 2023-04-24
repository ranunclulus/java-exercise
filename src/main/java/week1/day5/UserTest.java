package week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "조희수";
        user1.phonenumber = "000-0000-0000";
        user1.age = 24;

        User user2 = new User();
        user2.name = "홍길동";
        user2.phonenumber = "000-1111-1111";
        user2.age = 44;

        System.out.printf("%s 님은 성인입니까? %S\n", user1.name, user1.isAdult());
        System.out.printf("%s 님은 성인입니까? %S\n", user2.name, user2.isAdult());
    }
}
///rollback
