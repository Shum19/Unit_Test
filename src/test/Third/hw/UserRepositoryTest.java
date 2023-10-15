package Third.hw;

import HW.HW_3.DataBase;
import HW.HW_3.User;
import HW.HW_3.UserRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class UserRepositoryTest {



    @Test
    public void logoutNotAdminUsersTest(){
        List<User> userList = new DataBase().getUsers();
        UserRepository userRepository = new UserRepository();
        for (User user : userList) {
            userRepository.addUser(user);
        }
        int countGuest = 0;
        int countAdmin = 0;
        for (User usr : userRepository.getData()) {
            if (usr.getRights()){countAdmin++;}
            else countGuest++;
        }
        assertEquals(countAdmin, 2);
        assertEquals(countGuest, 7);

        userRepository.logoutNotAdminUsers();

        countAdmin = 0;
        countGuest = 0;
        for (User usr : userRepository.getData()) {
            if (usr.getRights()){countAdmin++;}
            else countGuest++;
        }
        assertEquals(countAdmin, 2);
        assertEquals(countGuest, 0);


    }
}
