package week7.test;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static junit.framework.TestCase.*;

public class DAOTest {
    @Test
    public void testLoginAndLogout() {
        String id = "tester";
        String ps = "1234";

        MemberDAO dao = new MemberDao();
        dao.initMember(); // 테스팅을 위해 디비 초기화
        Optional<Member> user = dao.login(id, ps);
        if(user.isEmpty()) { // 유저가 없다면
            dao.join(id, ps);
            user = dao.login(id, ps);
        }

        // 로그인 처리 테스트 코드
        assertEquals(id, user.get().getId());
        assertTrue(user.get().isLogined());

        // 로그아웃 처리 테스트 코드
        user = dao.logout(id);
        assertFalse(user.get().isLogined());
    }
}
