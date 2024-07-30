package week06.day2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    UserRepository userRepository = new UserRepository();

    @BeforeEach
    void initUsers() {
        userRepository.addUser(new User("Joe", "joe@gmail.com"));
        userRepository.addUser(new User("John", "John@gmail.com"));
        userRepository.addUser(new User("Jim", "Jim@gmail.com"));
    }

    @Test
    void getUserByName() {
        assertEquals("Joe", userRepository.getUserByName("Joe").getUserName());
    }

    @Test
    void getUserByNameFail() {
        String name = "Jimmy";

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> userRepository.getUserByName(name),
                "Cannot find user: " + name);

        assertEquals("Cannot find user: " + name, iae.getMessage());
    }
}