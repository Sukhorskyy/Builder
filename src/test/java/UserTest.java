import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;

    @Test
    void testBuilder() {
        user = User.builder().age(19).name("Bob")
                .occupation("Teacher")
                .gender("male")
                .weight(72)
                .height(171)
                .build();
        String expected = "User(name=Bob, age=19, height=171, gender=male, weight=72, occupations=[Teacher])";
        assertEquals(expected, user.toString());
    }
}