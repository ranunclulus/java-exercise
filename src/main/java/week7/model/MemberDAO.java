package week7.model;

import java.lang.reflect.Member;
import java.util.Optional;

public class MemberDAO extends BaseDAO{
    public Optional<Member> login(String id, String ps) {
        return Optional.empty();
    }

    public void join(String id, String ps) {
    }

    public Optional<Member> logout(String id) {
        return Optional.empty();
    }

    public void initMember() {
    }
}
